package com.mvp.base;


/**   
* @Title: VpActivity.java 
* @Package com.vp.loveu.base 
* @Description: TODO(用一句话描述该文件做什么) 
* @author zeus   
* @date 2015-10-20 下午4:26:30 
* @version V1.0   
*/

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.tpnet.params.VpRequestParams;
import com.utils.log.VPLog;

import rx.Subscriber;


/**

 * 基础activity
 * @ClassName: 
 * @Description:
 * @author ping
 * @date 
 */
public abstract class BaseBackMvpActivity extends FragmentActivity  {
	protected String tag;
	public Fragment mFragment;

	/**
	 * 根view
	 */
	public View mRootView ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		tag = "aiu"+ this.getComponentName().getShortClassName();	
		VPLog.d("oncreate:"+tag, "oncreate");

		setContentView(getContentView());

		if (getContentView() == R.layout.base_mvp_layout) {
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
	}


    /**
	 * 请求数据代理
	 */
	public static interface BasePresenter<T>{

		/**
		 * 请求数据代理
		 * @param params
		 * @param sub
         * @param <Obj>
         */
		 void requestData(VpRequestParams params, Subscriber sub);

		/**
		 * 刷新界面
		 * @param root 根view
		 * @param obj  数据bean
		 * @param type view 的类型。方便更新view做判断
         * @param <T>
         */
		  void updateView(View root, T obj, int type);
 	}

}