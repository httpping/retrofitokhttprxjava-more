package com.example.retrofitokrxtest.ui.demomvp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.base.app.R;
import com.baseapp.model.XSubscriber;
import com.baseapp.model.entity.LoginBean;
import com.example.retrofitokrxtest.xsbtest.Contents;
import com.mvp.base.BaseMvpFragment;
import com.tpnet.params.VpRequestParams;
import com.utils.log.NetLog;
import com.utils.log.VPLog;

import butterknife.BindView;

public class MvpDemoFragment extends BaseMvpFragment<PDemoO1> {


    @BindView(R.id.button2)
    Button button2;
    @BindView(R.id.RelativeLayout1)
    RelativeLayout RelativeLayout1;

    public static MvpDemoFragment newInstance(Bundle bundle) {

        Bundle args = new Bundle();
        MvpDemoFragment fragment = new MvpDemoFragment();
        fragment.operate = new PDemoO1();
        fragment.setArguments(args);
        return fragment;
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        //mRoot = super.onCreateView(inflater, container, savedInstanceState);
//        mRoot = inflater.inflate(getLayoutId(), container, false);
//        ButterKnife.bind(this, mRoot);
//
//
//        return  mRoot;
//    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_mvp_demo;
    }


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        VPLog.d(TAG, "isVisibleToUser :" + getUserVisibleHint());
    }

    @Override
    protected void initWidget(View root) {
        super.initWidget(root);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initData();
            }
        });

        RelativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"xxx",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void initData() {
        super.initData();

        VpRequestParams params = new VpRequestParams();
        operate.requestData(params, new XSubscriber<LoginBean>(getActivity()) {

                    @Override
                    public void onError(Throwable arg0) {
                        super.onError(arg0);
                        arg0.printStackTrace();
                        NetLog.d(TAG, arg0 + "");
                    }

                    @Override
                    public void onNext(LoginBean arg0) {
                        NetLog.d(TAG, "onNext: " + Thread.currentThread().getName());
                        NetLog.d(TAG, arg0 + "");

                        NetLog.d(TAG, arg0 + "" + arg0.Data.token);
                        Contents.TOKEN = arg0.Data.token;
                        operate.updateView(mRoot, arg0, 0);

                    }
                }
        );

        operate.login();
        operate.share();
    }



//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        // TODO: inflate a fragment view
//        View rootView = super.onCreateView(inflater, container, savedInstanceState);
//        ButterKnife.bind(this, rootView);
//        return rootView;
//    }
}
