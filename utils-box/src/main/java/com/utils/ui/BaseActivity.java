/*
package com.utils.ui;


*/
/**
* @Title: VpActivity.java 
* @Package com.vp.loveu.base 
* @Description: TODO(用一句话描述该文件做什么) 
* @author zeus   
* @date 2015-10-20 下午4:26:30 
* @version V1.0   
*//*


import android.os.Bundle;

import com.utils.log.VPLog;


*/
/**

 * 基础activity
 * @ClassName: 
 * @Description:
 * @author ping
 * @date 
 *//*

public abstract class BaseActivity extends AppCompatActivity {
	protected String tag;
	private Fragment mFragment;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		tag = "aiu"+ this.getComponentName().getShortClassName();	
		VPLog.d("oncreate:"+tag, "oncreate");


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
	

}
*/
