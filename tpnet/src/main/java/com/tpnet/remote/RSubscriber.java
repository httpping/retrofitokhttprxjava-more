package com.tpnet.remote;


import com.utils.log.NetLog;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

/**
 * 对话框操作处理
 * @param <T>
 */
public abstract class RSubscriber<T> extends Subscriber<T> {

    /**
     * 对话框Show
     */

    @Override
    public void onStart() {
        super.onStart();

        Observable.just("start").subscribeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                showDialog();
            }
        });
    }

    @Override
    public void onCompleted() {
        Observable.just("close").subscribeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                 closeDialog();
            }
        });
    }

    @Override
    public void onError(Throwable e) {
        onCompleted();
        e.printStackTrace();
    }



    //对话框操作
    public void showDialog(){
        NetLog.d("","showDialog()");
    }
    public void closeDialog(){
        NetLog.d("","closeDialog()");
    }
}
