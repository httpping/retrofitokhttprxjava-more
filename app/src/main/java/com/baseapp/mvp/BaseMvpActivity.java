package com.baseapp.mvp;


/**   
* @Title: VpActivity.java 
* @Package com.vp.loveu.base 
* @Description: TODO(用一句话描述该文件做什么) 
* @author zeus   
* @date 2015-10-20 下午4:26:30 
* @version V1.0   
*/

import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.base.app.R;
import com.tpnet.params.VpRequestParams;
import com.utils.log.VPLog;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import rx.Subscriber;


/**

 * 基础activity
 * @ClassName: 
 * @Description:
 * @author ping
 * @date 
 */
public abstract class BaseMvpActivity extends BaseActivity{
	protected String tag;
	public Fragment mFragment;

	/**
	 * 根view
	 */
	public View mRootView ;
	private static final int INVALID_VAL = -1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		tag = "aiu"+ this.getComponentName().getShortClassName();	
		VPLog.d("oncreate:"+tag, "oncreate");
		// 经测试在代码里直接声明透明状态栏更有效
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT && Build.VERSION.SDK_INT < Build.VERSION_CODES.M ) {
			Window window = getWindow();
			// Translucent status bar
			window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			// Translucent navigation bar
			window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

		}


		EventBus.getDefault().register(this);
		setContentView(getContentView());

		if (getContentView() ==  R.layout.base_mvp_layout) {
			mRootView = findViewById(R.id.activity_root_view);
		}
	}


	/**
	 * 重写替换默认layout布局
	 * @return
     */
	public int getContentView(){
		return  R.layout.base_mvp_layout;
	}


	protected void addFragment( Fragment fragment) {
		addFragment(mRootView.getId(),fragment);
	}


		/**
         * 添加fragment
         * @param frameLayoutId
         * @param fragment
         */
	protected void addFragment(int frameLayoutId, Fragment fragment) {
		if (fragment != null) {
			FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
			if (fragment.isAdded()) {
				if (mFragment != null) {
					transaction.hide(mFragment).show(fragment);
				} else {
					transaction.show(fragment);
				}
			} else {
				if (mFragment != null) {
					transaction.hide(mFragment).add(frameLayoutId, fragment);
				} else {
					transaction.add(frameLayoutId, fragment);
				}
			}
			mFragment = fragment;
			transaction.commit();
		}
	}





	@Override
	public void finish() {
		super.finish();
		VPLog.d(tag, "finish");
	}
	

	@Override
	protected void onResume() {
		super.onResume();
		VPLog.d(tag, "onResume");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		VPLog.d(tag, "onPause");
	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
		VPLog.d(tag, "onDestroy");
		EventBus.getDefault().unregister(this);
	}


    /**
	 * 请求数据代理
	 */
	public static interface BasePresenter<T>{

		/**
		 * 请求数据代理
		 * @param params
		 * @param sub
         * @param
         */
		 void requestData(VpRequestParams params, Subscriber sub);

		/**
		 * 刷新界面
		 * @param root 根view
		 * @param obj  数据bean
		 * @param type view 的类型。方便更新view做判断
         * @param
         */
		  void updateView(View root, T obj, int type);
 	}

	@Subscribe(threadMode = ThreadMode.MAIN)
	public void onMessageEvent(Message event) {/* Do something */};
}
