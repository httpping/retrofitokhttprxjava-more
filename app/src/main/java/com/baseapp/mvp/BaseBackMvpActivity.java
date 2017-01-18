package com.baseapp.mvp;


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

import com.base.app.R;
import com.baseapp.mvp.widget.PublicTitleView;
import com.utils.log.VPLog;


/**

 * 基础activity
 * @ClassName: 
 * @Description:
 * @author ping
 * @date 
 */
public abstract class BaseBackMvpActivity extends BaseMvpActivity {
	protected String tag;
	public Fragment mFragment;


	public PublicTitleView mPublicTitleView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		tag = "aiu"+ this.getComponentName().getShortClassName();	
		VPLog.d("oncreate:"+tag, "oncreate");

		setContentView(getContentView());
		mRootView = findViewById(R.id.main_content);
		mPublicTitleView = (PublicTitleView) findViewById(R.id.public_title_view);

	}

	@Override
	public void setTitle(CharSequence title) {
		mPublicTitleView.setTitle(title);
	}


	/**
	 * 重写替换默认layout布局
	 * @return
     */
	public int getContentView(){
		return R.layout.base_toolbar_mvp_layout;
	}



}
