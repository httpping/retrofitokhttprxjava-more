package com.baseapp.comm;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.base.app.R;
import com.baseapp.weiget.TimeoutRemindView;
import com.mvp.base.BaseMvpFragment;
import com.utils.log.VPLog;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrHandler;

public class WebViewFragment<P> extends BaseMvpFragment {

    WebView mWebView;
    TimeoutRemindView mRemindView;
    @BindView(R.id.rotate_header_web_view_frame)
    PtrClassicFrameLayout mPtrFrame;

    private ProgressBar mProgressbar;
    public String mUrl;


    public static WebViewFragment newInstance(Bundle bundle) {
        WebViewFragment fragment = new WebViewFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mUrl = (String) getBundleSerializable(WebViewActivity.URL);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.public_webview_activity;
    }


    @Override
    protected void initWidget(View root) {
        super.initWidget(root);
        mWebView = (WebView) findViewById(R.id.public_webview);
        mProgressbar = (ProgressBar) findViewById(R.id.webview_progressBar);
        WebSettings settings = mWebView.getSettings();

        mRemindView = (TimeoutRemindView) findViewById(R.id.timeoutRemindView1);
        mRemindView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mRemindView.setVisibility(View.GONE);
                mWebView.reload();
            }
        });
        mWebView.clearCache(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(false);
        settings.setCacheMode(WebSettings.LOAD_DEFAULT);

        WebViewClient wn = new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                mHandler.removeMessages(TIMEOUT_MARKER);
                //mRemindView.setVisibility(View.GONE);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                VPLog.d("web", "url:" + url);
                if (!TextUtils.isEmpty(url) && url.startsWith("loveu")) {
                    Uri uri = Uri.parse(url);
                    Intent it = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(it);
                    mUrl = view.getUrl();
                    view.loadUrl(mUrl);
                    return true;
                }
                mUrl = url;

              //  mUrl = UrlIsAppUtil.appendAppIsParam(url);

                view.loadUrl(mUrl);
                return true;
            }

            @Override
            public void onReceivedError(WebView view, int errorCode,
                                        String description, String failingUrl) {
                //super.onReceivedError(view, errorCode, description, failingUrl);
                //Toast.makeText(WebViewActivity.this, "error:" +errorCode, 1).show();
                VPLog.d(TAG, "onReceivedError");
                //	 view.loadUrl("javascript:document.body.innerHTML=\"" + errorCode + "\"");
                mHandler.removeMessages(TIMEOUT_MARKER);
              //  mRemindView.setVisibility(View.VISIBLE);
            }


            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                VPLog.d(TAG, "onPageStarted");
                mHandler.sendEmptyMessageDelayed(TIMEOUT_MARKER, 60 * 1000);
            }
        };
        mWebView.setWebViewClient(wn);
        operate.updateView(mWebView, null, 0);

        WebChromeClient wvcc = new WebChromeClient() {

            @Override
            public void onReceivedTitle(WebView view, String title) {
                super.onReceivedTitle(view, title);
                VPLog.i("ANDROID_LAB", "TITLE=" + title);
                //mPubTitleView.mTvTitle.setText(title);
                operate.updateView(mWebView, title, 1);
            }

            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                if (newProgress == 100) {
                    mProgressbar.setVisibility(View.GONE);
                } else {
                    if (mProgressbar.getVisibility() == View.GONE)
                        mProgressbar.setVisibility(View.VISIBLE);
                    mProgressbar.setProgress(newProgress);
                }
                super.onProgressChanged(view, newProgress);
            }


        };
        // 设置setWebChromeClient对象
        mWebView.setWebChromeClient(wvcc);

        mWebView.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimetype,
                                        long contentLength) {
                // 实现下载的代码
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        VPLog.d("web", "murl:" + mUrl);

        mWebView.loadUrl(mUrl);

        mPtrFrame.setLastUpdateTimeRelateObject(this);
        mPtrFrame.setPtrHandler(new PtrHandler() {
            @Override
            public boolean checkCanDoRefresh(PtrFrameLayout frame, View content, View header) {
                return PtrDefaultHandler.checkContentCanBePulledDown(frame, mWebView, header);
            }

            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                mWebView.reload();
                frame.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mPtrFrame.refreshComplete();
                    }
                }, 1000);
            }
        });

//        // header
//        final StoreHouseHeader header = new StoreHouseHeader(getContext());
//        header.setPadding(0, DensityUtil.dip2px(getContext(), 15), 0, 0);
//        header.setTextColor(R.color.blue);
//        header.initWithString("vp-Honor");
//        mPtrFrame.setHeaderView(header);
//        mPtrFrame.addPtrUIHandler(header);

    }

    /**
     * 回调处理
     */
    public static final int TIMEOUT_MARKER = 400;
    Handler mHandler = new Handler() {
        public void handleMessage(Message msg) {

            switch (msg.what) {
                case TIMEOUT_MARKER: //超时
                    //Toast.makeText(WebViewActivity.this, "超时", 1).show();
                    mRemindView.setVisibility(View.VISIBLE);
                    break;

                default:
                    break;
            }

        }

        ;
    };


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        VPLog.d(TAG, "isVisibleToUser :" + getUserVisibleHint());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }
}
