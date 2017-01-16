package com.com.baseapp.ui.demomvp;

import android.os.Bundle;

import com.example.retrofitokrxtest.R;
import com.example.retrofitokrxtest.xsbtest.Contents;
import com.example.retrofitokrxtest.xsbtest.RRSubscri;
import com.com.baseapp.model.remote.entity.LoginBean;
import com.mvp.base.BaseMvpFragment;
import com.tpnet.params.VpRequestParams;
import com.utils.log.NetLog;

public class MvpDemoFragment extends BaseMvpFragment<PDemoO1> {

    public static MvpDemoFragment newInstance(Bundle bundle) {

        Bundle args = new Bundle();
        MvpDemoFragment fragment = new MvpDemoFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_mvp_demo;
    }


    @Override
    protected void initData() {
        super.initData();

        VpRequestParams params =new VpRequestParams();
        params.put("username","13888678188");
        params.put("password","678188");
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


        operate.share();
    }
}
