package com.baseapp.comm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.base.app.R;


/**   
* @Title:
* @Package com.vpclub.ppshare.index.widget 
* @Description: 销售宝对话框
* @author ping
* @date 2016年12月12日 下午12:53:01
 *
*/

public class XsbRemindDialog extends DialogFragment implements View.OnClickListener{


	public TextView tvOldStore;
	public TextView mCancel;
	public TextView mOk;
	View.OnClickListener mClickListener;

	CharSequence mRemindInfo;


	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setCancelable(false);
		setStyle(DialogFragment.STYLE_NORMAL,R.style.dialog);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		//getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
		View root = inflater.inflate(R.layout.rrs_remind_binder_dialog,container);
		tvOldStore = (TextView) root.findViewById(R.id.old_store_name);
		mCancel = (TextView) root.findViewById(R.id.btn_cancel);
		mOk = (TextView) root.findViewById(R.id.btn_ok);
		mCancel.setOnClickListener(this);
		mOk.setOnClickListener(this);

		tvOldStore.setText(mRemindInfo);



		return  root;
	}


	public static XsbRemindDialog newInstance(CharSequence remindInfo, View.OnClickListener clickListener) {
		Bundle args = new Bundle();
		XsbRemindDialog fragment = new XsbRemindDialog();
		fragment.setArguments(args);
		fragment.mClickListener = clickListener;
		fragment.mRemindInfo = remindInfo;
		return fragment;
	}


	public void show(FragmentActivity activity) {
		 show(activity.getSupportFragmentManager(), "dialog");
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()){
			case R.id.btn_cancel:
				dismiss();
				break;
			case R.id.btn_ok:
				dismiss();
				if (mClickListener!=null){
					mClickListener.onClick(v);
				}
				break;
		}

	}
}
