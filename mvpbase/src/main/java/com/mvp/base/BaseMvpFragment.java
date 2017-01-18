package com.mvp.base;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.utils.log.VPLog;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.Serializable;

import butterknife.ButterKnife;

/**
 * Fragment基础类
 */

@SuppressWarnings("WeakerAccess")
public abstract class BaseMvpFragment<P extends BaseMvpActivity.BasePresenter> extends Fragment {
    protected Context mContext; // 上下文
    public View mRoot;   // 基础root
    protected Bundle mBundle; // 参数
    public LayoutInflater mInflater; // layout

    public P operate;//代理对象

    public  String TAG ;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;

        try{
            operate = (P)mContext;
        }catch (Exception e){
            VPLog.e(TAG,"no delegate");
           // e.printStackTrace();
        }

    }

    @Override
    public void onDetach() {
        super.onDetach();

        /**
         * 释放
         */
        mContext = null;
        operate = null;
    }

    public static BaseMvpFragment newInstance(Bundle bundle) {
        if (bundle == null){
            bundle = new Bundle();
        }
        return  null;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = "fra-"+  getClass().getSimpleName();
        mBundle = getArguments();
        initBundle(mBundle);

        VPLog.d(TAG,"onCreate");
        EventBus.getDefault().register(this);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        VPLog.d(TAG,"onCreateView");
        if (mRoot != null) {
            ViewGroup parent = (ViewGroup) mRoot.getParent();
            if (parent != null)
                parent.removeView(mRoot);
        } else {
            mRoot = inflater.inflate(getLayoutId(), container, false);

            mInflater = inflater;
            // Do something
            onBindViewBefore(mRoot);
            // Bind view
            ButterKnife.bind(this, mRoot);
            // Get savedInstanceState
            if (savedInstanceState != null)
                onRestartInstance(savedInstanceState);
            // Init
            initWidget(mRoot);
            initData();
        }
        return mRoot;
    }

    protected void onBindViewBefore(View root) {
        // ...
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        VPLog.d(TAG,"onDestroy");
        EventBus.getDefault().unregister(this);
        mBundle = null;
    }


    @Override
    public void onResume() {
        super.onResume();
        VPLog.d(TAG,"onResume");
    }

    protected abstract int getLayoutId();

    protected void initBundle(Bundle bundle) {
    }

    protected void initWidget(View root) {

    }

    protected void initData() {

    }

    protected <T extends View> T findViewById(int viewId) {
        return (T) mRoot.findViewById(viewId);
    }

    protected <T extends Serializable> T getBundleSerializable(String key) {
        if (mBundle == null) {
            return null;
        }
        return (T) mBundle.getSerializable(key);
    }
    protected void onRestartInstance(Bundle bundle) {
    }


    public Application getApplication() {
        if (getActivity() == null){
            return  null;
        }
        return (Application) getActivity().getApplication();
    }


    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(Message event) {/* Do something */};

}
