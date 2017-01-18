package com.baseapp.comm;


import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import com.mvp.base.BaseBackMvpActivity;
import com.mvp.base.BaseMvpActivity;
import com.tpnet.params.VpRequestParams;

import rx.Subscriber;


public class WebViewActivity extends BaseBackMvpActivity implements BaseMvpActivity.BasePresenter {

	WebView mWebView;


	public static final String URL = "url";

	public String mUrl;
	private WebViewFragment webViewFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mUrl = getIntent().getStringExtra(URL);
		Bundle bundle = new Bundle();
		bundle.putString(URL,mUrl);
		webViewFragment = WebViewFragment.newInstance(bundle);
		addFragment(mRootView.getId(),webViewFragment);
	}


	@Override
	public void onBackPressed() {
		if (mWebView!=null && mWebView.canGoBack()) {
			mWebView.goBack();
		} else {
			super.onBackPressed();
		}
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		if (mWebView!=null) {
			mWebView.onPause();
		}
	}

	@Override
	protected void onResume() {
		super.onResume();
		if (mWebView !=null) {
			mWebView.onResume();
		}
	}
	@Override
	public void finish() {
		super.finish();
		//mWebView.onPause();
		
	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
		if (mWebView!=null) {
			mWebView.destroy();
		}
	}

	@Override
	public void requestData(VpRequestParams params, Subscriber sub) {

	}

	@Override
	public void updateView(View root, Object obj, int type) {
		mWebView = (WebView) root;

		if (obj!=null && type ==1){
			mPublicTitleView.setTitle(obj.toString());
		}
	}
}
