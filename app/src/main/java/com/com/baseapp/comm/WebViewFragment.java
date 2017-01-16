package com.com.baseapp.comm;

import android.os.Bundle;

import com.base.app.R;
import com.com.baseapp.model.entity.LoginBean;
import com.com.baseapp.ui.demomvp.PDemoO1;
import com.example.retrofitokrxtest.xsbtest.Contents;
import com.example.retrofitokrxtest.xsbtest.RRSubscri;
import com.mvp.base.BaseMvpFragment;
import com.tpnet.params.VpRequestParams;
import com.utils.log.NetLog;
import com.utils.log.VPLog;

public class WebViewFragment extends BaseMvpFragment<PDemoO1> {

    public static WebViewFragment newInstance(Bundle bundle) {

        Bundle args = new Bundle();
        WebViewFragment fragment = new WebViewFragment();
        fragment.operate = new PDemoO1();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_mvp_demo;
    }


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        VPLog.d(TAG,"isVisibleToUser :" + getUserVisibleHint());
    }

    @Override
    protected void initData() {
        super.initData();

        VpRequestParams params =new VpRequestParams();
        operate.requestData(params, new RRSubscri<LoginBean>(getActivity()) {

            @Override
            public void onError(Throwable arg0) {
                super.onError(arg0);
                arg0.printStackTrace();
                NetLog.d(TAG, arg0 +"");
            }

            @Override
            public void onNext(LoginBean arg0) {
                NetLog.d(TAG, "onNext: " + Thread.currentThread().getName());
                NetLog.d(TAG, arg0 +"" );

                NetLog.d(TAG, arg0 +"" + arg0.Data.token);
                Contents.TOKEN = arg0.Data.token;
                operate.updateView(mRoot, arg0,0);
            }
        });

        operate.login();
        operate.share();
    }


}
