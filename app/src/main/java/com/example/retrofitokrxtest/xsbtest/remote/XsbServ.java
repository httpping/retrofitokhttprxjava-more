package com.example.retrofitokrxtest.xsbtest.remote;

import com.example.retrofitokrxtest.xsbtest.remote.entity.LoginBean;

import java.util.Map;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * 销售宝服务器
 */
public interface XsbServ {

	

	@FormUrlEncoded
	@POST("StoreServer/Store/VerifyAccount")
	Observable<LoginBean> VerifyAccount(@FieldMap Map<String, String> params);


 
}
