package com.baseapp.ui.demomvp;
/**
 * Created by tp on 2017/1/12.
 */

import android.view.View;

import com.baseapp.model.DataManager;
import com.baseapp.model.entity.LoginBean;
import com.mvp.base.BaseMvpActivity;
import com.tpnet.params.VpRequestParams;
import com.utils.log.VPLog;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 *                             _ooOoo_
 *                            o8888888o
 *                            88" . "88
 *                            (| -_- |)
 *                            O\  =  /O
 *                         ____/`---'\____
 *                       .'  \\|     |//  `.
 *                      /  \\|||  :  |||//  \
 *                     /  _||||| -:- |||||-  \
 *                     |   | \\\  -  /// |   |
 *                     | \_|  ''\---/''  |   |
 *                     \  .-\__  `-`  ___/-. /
 *                   ___`. .'  /--.--\  `. . __
 *                ."" '<  `.___\_<|>_/___.'  >'"".
 *               | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *               \  \ `-.   \_ __\ /__ _/   .-` /  /
 *          ======`-.____`-.___\_____/___.-`____.-'======
 *                             `=---='
 *          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 * 佛祖保佑        永无BUG
 * 佛曰:
 * 写字楼里写字间，写字间里程序员；
 * 程序人员写程序，又拿程序换酒钱。
 * 酒醒只在网上坐，酒醉还来网下眠；
 * 酒醉酒醒日复日，网上网下年复年。
 * 但愿老死电脑间，不愿鞠躬老板前；
 * 奔驰宝马贵者趣，公交自行程序员。
 * 别人笑我忒疯癫，我笑自己命太贱；
 * 不见满街漂亮妹，哪个归得程序员？
 *
 * @name retrofitokhttprxjava
 * @class name：com.example.retrofitokrxtest.mvp
 * @class describe
 * @anthor tp QQ:871625458
 * @time 2017/1/12 11:32
 * @change
 * @chang time
 * @class describe
 */
public class PDemoO1 implements BaseMvpActivity.BasePresenter<LoginBean> {


    @Override
    public  void requestData(VpRequestParams params, Subscriber sub) {
        params.put("username","13888678188");
        params.put("password","678188");

        DataManager.XsbServ().VerifyAccount(params.getUrlParams()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(sub);
    }

    @Override
    public void updateView(View root, LoginBean obj, int type) {
        VPLog.d("","updateView ()");

    }

    
    
    
    
    public void share(){
        //
    }

    public void login() {

    }
}
