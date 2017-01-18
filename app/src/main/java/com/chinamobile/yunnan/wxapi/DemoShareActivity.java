package com.chinamobile.yunnan.wxapi;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.base.app.R;

import java.util.HashMap;

import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;


public class DemoShareActivity extends Activity implements PlatformActionListener {

	Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_main);
        ShareSDK.initSDK(this);
        button = (Button) findViewById(R.id.share_btn);
        
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showShare();

//				Platform plat = ShareSDK.getPlatform(SinaWeibo.NAME);
//				authorize(plat);
			}
		});
    }

    private void showShare() {
    	 OnekeyShare oks = new OnekeyShare();
    	 //关闭sso授权
    	 oks.disableSSOWhenAuthorize(); 
    	 
    	// 分享时Notification的图标和文字  2.5.9以后的版本不调用此方法
    	 //oks.setNotification(R.drawable.ic_launcher, getString(R.string.app_name));
    	 // title标题，印象笔记、邮箱、信息、微信、人人网和QQ空间使用
    	 oks.setTitle("title share");
    	 // titleUrl是标题的网络链接，仅在人人网和QQ空间使用
    	 oks.setTitleUrl("http://sharesdk.cn");
    	 // text是分享文本，所有平台都需要这个字段
    	 oks.setText("我是分享文本");
    	// oks.setImageUrl("http://pic.baike.soso.com/p/20130904/20130904163443-2008438569.jpg");
    	 // imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
    	 //oks.setImagePath("/sdcard/test.jpg");//确保SDcard下面存在此张图片
    	 // url仅在微信（包括好友和朋友圈）中使用
         oks.setUrl("http://sharesdk.cn");
    	 // comment是我对这条分享的评论，仅在人人网和QQ空间使用
    	 oks.setComment("我是测试评论文本");
    	 // site是分享此内容的网站名称，仅在QQ空间使用
    	 oks.setSite(getString(R.string.app_name));
    	 // siteUrl是分享此内容的网站地址，仅在QQ空间使用
    	 oks.setSiteUrl("http://sharesdk.cn");
    	 
    	// 启动分享GUI
    	 oks.setCallback(new PlatformActionListener() {
			
			@Override
			public void onError(Platform arg0, int arg1, Throwable arg2) {
				// TODO Auto-generated method stub
				Log.d("share", "onError");

			}
			
			@Override
			public void onComplete(Platform arg0, int arg1, HashMap<String, Object> arg2) {
				Log.d("share", "onComplete");
			}
			
			@Override
			public void onCancel(Platform arg0, int arg1) {
				// TODO Auto-generated method stub
				Log.d("share", "onCancel");

			}
		});
    	 oks.show(this);
    }
    
    private void authorize(Platform plat) {
    	 if (plat == null) {
    	 //popupOthers();
    	 return;
    	 }
    	//判断指定平台是否已经完成授权
    	if(plat.isAuthValid()) {
    	 String userId = plat.getDb().getUserId();
    	 if (userId != null) {
    	 Log.d("share", "userId ： "+userId);
    	 /*UIHandler.sendEmptyMessage(MSG_USERID_FOUND, this);
    	 login(plat.getName(), userId, null);*/
    	// return;
    	 }
    	 }
    	 plat.setPlatformActionListener(this);
    	 // true不使用SSO授权，false使用SSO授权
    	 plat.SSOSetting(false);
    	 plat.authorize();
    	 //获取用户资料
    	 //plat.showUser(null);
    	 }
    
    
    @Override
	public void onError(Platform arg0, int arg1, Throwable arg2) {
		// TODO Auto-generated method stub
		Log.d("share", "onError");

	}
	
	@Override
	public void onComplete(Platform arg0, int arg1, HashMap<String, Object> arg2) {
		Log.d("share", "onComplete");
	}
	
	@Override
	public void onCancel(Platform arg0, int arg1) {
		// TODO Auto-generated method stub
		Log.d("share", "onCancel");

	}
  
}
