package com.baseapp.comm;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

import com.baseapp.XApplication;
import com.utils.log.VPLog;

/**
 * 内部行为 跳转
 * 
 * @author tanping 2015-12-9
 */
public class InwardAction  {

	public ActionType mActionType;// 行为type
	public Uri mUri;
	private String tag = "InwardAction";

	/**
	 * 行为分类
	 * 
	 * @author tanping 2015-12-9 详情 action 看客户端文档
	 */

	public static enum ActionType {
		nearby(1), activity(2), emotion_help(3), video(4), voice(5), person_index(6), news_list(6), online_course(7), chat_topic(
				8), pua_course(9), pua_course_detail(10), http_web_url(11), news_detail(12), launch(13), activity_sign_in(14), share_app(
						15), favour_app(16),app_sign_in(17);

		final int value;

		ActionType(int v) {
			this.value = v;
		}
	}

	/**
	 * 解析action
	 * 
	 * @param spec
	 * @return
	 */
	public static InwardAction parseAction(String spec) {
		InwardAction inwardAction = new InwardAction();
		VPLog.d("inward", spec + "");
		try {
			if (spec.startsWith("http://") || spec.startsWith("https://")) {
				inwardAction.mActionType = ActionType.http_web_url;
				inwardAction.mUri = Uri.parse(spec);
				return inwardAction;
			}
			inwardAction.mUri = Uri.parse(spec);
			String action = inwardAction.mUri.getAuthority();
			inwardAction.mActionType = ActionType.valueOf(action);
			if (inwardAction.mActionType == null) {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return inwardAction;

	}

	/**
	 * 通过key取值
	 * 
	 * @param key
	 * @return
	 */
	public String getValueForKey(String key) {
		if (mUri != null || TextUtils.isEmpty(key)) {
			return mUri.getQueryParameter(key);
		}
		return null;
	}

	/**
	 * start activity的功能根据类型 public 公用
	 * 
	 * @return
	 */
	public boolean toStartActivity(Context context) {
		if (context == null) {
			context = XApplication.getInstance();
		}

		try {
			if (mActionType == ActionType.activity) {// 活动
				goActivity(context);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	private void goActivity(Context context) {

	}

	/**
	 * 给app好评 void TODO 安卓暂时不做
	 */
	private void goFavour() {

	}



	@Override
	public String toString() {
		return "InwardAction [mActionType=" + mActionType + ", mUri=" + mUri + "]";
	}


}
