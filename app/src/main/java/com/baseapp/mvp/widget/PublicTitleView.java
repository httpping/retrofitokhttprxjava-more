package com.baseapp.mvp.widget;


import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mvp.base.R;
import com.utils.ui.BaseActivity;


/**
 * @author：ping
 * @date: 2015-11-10 下午5:25:16
 * @Description: 简单的title view
 */
public class PublicTitleView extends RelativeLayout implements OnClickListener {
	public ImageView mLeftImage;
	public TextView mBtnRight;
	public TextView mTvTitle;
	
	public RelativeLayout mRightLayout;
	public RelativeLayout mLeftLayout;
	
	public View bgView ;
	
	public RelativeLayout mRadioContainer;
	public ImageView mRadioIvPlay;
	
	public PublicTitleView(Context context) {
		super(context);
		initView();
	}
	
	
	public PublicTitleView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initView();
		
	}
	
	private void initView() {
		inflate(getContext(), R.layout.public_top_title, this);

		if (isInEditMode()) {
			return ;
		}
		mLeftLayout = (RelativeLayout) findViewById(R.id.left_back_layouts);
		mLeftImage = (ImageView) findViewById(R.id.left_image);
				
		mRightLayout = (RelativeLayout) findViewById(R.id.right_layout);
		mBtnRight = (TextView) findViewById(R.id.right_textview);
		mTvTitle = (TextView) findViewById(R.id.title_textview);
		


		mLeftLayout.setOnClickListener(this);
		
		//setBackgroundResource(R.color.white);
		
	}
	
	public void setTitle(CharSequence title){
		mTvTitle.setText(title);
	}


	@Override
	public void onClick(View v) {
		if (v.equals(mLeftLayout)){
			if(getContext() instanceof BaseActivity){
				((BaseActivity)getContext()).finish();
			}
		}

		
	}
	
}
