package com.com.baseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.base.app.R;
import com.com.baseapp.comm.WebViewActivity;
import com.com.baseapp.ui.demomvp.MvpDemoFragment;
import com.mvp.base.BaseMvpActivity;

/**
 *
 */

public class MainActivity extends BaseMvpActivity implements OnCheckedChangeListener {

	private ViewPager mViewPager;
	private RadioGroup mRadioGroup;

	public ImageView mHeadImageView;

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		initView();

		Intent intent = new Intent(this, WebViewActivity.class);
		intent.putExtra(WebViewActivity.URL,"http://www.baidu.com");
		//startActivity(intent);
	}

	@Override
	public int getContentView() {
		return R.layout.activity_main;
	}

	@Override
	protected void onNewIntent(Intent intent) {
		Log.d(tag, "onNewIntent");
		setIntent(intent);
		String command = intent.getStringExtra("command");

	}

	private void initView() {
		mViewPager = (ViewPager) findViewById(R.id.home_viewpager);
		mRadioGroup = (RadioGroup) findViewById(R.id.home_radiogroup);
		HomePagerAdapter mAdapter = new HomePagerAdapter(getSupportFragmentManager());
		mViewPager.setAdapter(mAdapter);
		mViewPager.setOffscreenPageLimit(4);
		RadioButton button = (RadioButton) mRadioGroup.getChildAt(0);
		//button.setChecked(true);// 默认选中第一个
		mRadioGroup.check(mRadioGroup.getChildAt(0).getId());
		mViewPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {

				for (int i = 0; i < mRadioGroup.getChildCount(); i++) {
					RadioButton button = (RadioButton) mRadioGroup.getChildAt(i);
					button.setChecked(false);
					if (position == i) {
						button.setChecked(true);
					}
				}
			}

			@Override
			public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

			}

			@Override
			public void onPageScrollStateChanged(int state) {

			}
		});
		mRadioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				switch (checkedId) {
				case R.id.home_rb_one:
					mViewPager.setCurrentItem(0);
					break;
				case R.id.home_rb_two:
					mViewPager.setCurrentItem(1);
					break;
				case R.id.home_rb_three:
					mViewPager.setCurrentItem(2);
					break;
				case R.id.home_rb_fours:
					mViewPager.setCurrentItem(3);
					break;

				default:
					break;
				}
			}
		});


	}

	@Override
	protected void onResume() {
		super.onResume();

	}

	@Override
	public void onCheckedChanged(RadioGroup radioGroup, int i) {

	}


	private class HomePagerAdapter extends FragmentStatePagerAdapter {

		public HomePagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int arg0) {
			return MvpDemoFragment.newInstance(null);
		}

		@Override
		public int getCount() {
			return 4;
		}
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {

		return super.onKeyDown(keyCode, event);
	}


}
