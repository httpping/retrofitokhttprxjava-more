package com.com.baseapp.model;

import android.support.v4.util.SimpleArrayMap;
import android.text.TextUtils;

import com.com.baseapp.model.remote.XsbServ;
import com.example.retrofitokrxtest.xsbtest.Contents;
import com.example.retrofitokrxtest.xsbtest.DemoIn;
import com.tpnet.VpHttpClient;
import com.tpnet.interceptor.BasicParamsInterceptor;
import com.tpnet.remote.BasicDataManager;
import com.utils.log.VPLog;
import com.utils.sign.MD5Util;
import com.utils.time.MUtil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by tp on 2016/12/21.
 * 管理所有的接口列表
 */
public class DataManager extends BasicDataManager{


    private static  DataManager dataManager ;


    private DataManager() {
        super();
    }

    public synchronized static DataManager newInstance() {
        if (dataManager == null){
            dataManager = new DataManager();
            dataManager.init(Contents.URL_HTTP);
        }
        return  dataManager;
    }

    @Override
    public void init(String baseUrl) {
        vpNewtWork = new VpHttpClient.Builder().addBaseUrl(baseUrl).addBasicParamInterceptor(createPublicParamsInterceptor()).build();
    }

    /**
     * 获取接口
     * @return
     */
    public static DemoIn Shop(){
        return newInstance().getInterIml(DemoIn.class);
    }


    public static XsbServ XsbServ(){
        return newInstance().getInterIml(XsbServ.class);
    }


    /**
     * test basice params
     * @return
     */
    public static BasicParamsInterceptor createPublicParamsInterceptor(){

        HashMap<String ,String> publicParams = new HashMap<>();
        addPublicParams(publicParams);
        SimpleArrayMap<String,String> queryParams = new SimpleArrayMap<>();
        queryParams.put("x1","dean");
        queryParams.put("t2","boss");
        BasicParamsInterceptor interceptor = new BasicParamsInterceptor.Builder()
                .addParamsMap(publicParams)
                .addQueryParamsMap(queryParams)
                .build();

        return  interceptor;
    }


    private static HashMap<String, String> addPublicParams(HashMap<String, String> params){
        HashMap<String, String> par=null;
        if(params==null){
            par=new HashMap<String, String>();
        }else{
            par=params;
        }

        par.put(Contents.HttpKey.AppKey, Contents.APPKEY);
        par.put(Contents.HttpKey.TimesSamp, MUtil.getTimeStamp());
        par.put(Contents.HttpKey.Digest, toDigest());
        par.put(Contents.HttpKey.Token, Contents.TOKEN);
        par.put(Contents.HttpKey.origin, "1"); // 1:android 2:ios
        String v = "300";
        if(v == null || v.equals("Unknown") || v.trim().length() <= 0){
            v = Contents.VERSION_CODE;
        }
        par.put(Contents.HttpKey.Version, v);


        LinkedList<String> keys = new LinkedList<String>();
        //删除掉非法的参数 add by ping
        Iterator<String> it = par.keySet().iterator();
        while ( it.hasNext()){
            String key = it.next();
            if ( TextUtils.isEmpty(par.get(key))) {
                keys.add(key);
            }
        }
        for (int i = 0; i < keys.size(); i++) {
            par.remove(keys.get(i));
        }
        VPLog.d("ok-result", "public-params: "+params);


        return par;
    }

    private static HashMap<String,String> getPublicHeaders(){
        HashMap<String,String> headers=new HashMap<String,String>();
        headers.put("Content-type", "application/x-www-form-urlencoded;charset=UTF-8");
        return headers;
    }
    public static String toDigest(){
        String time = MUtil.getTimeStamp();
        String value = Contents.HttpKey.AppKey + Contents.APPKEY + Contents.HttpKey.TimesSamp + time + Contents.SECRET;
        value = MD5Util.MD532(value);
        return value;
    }


}
