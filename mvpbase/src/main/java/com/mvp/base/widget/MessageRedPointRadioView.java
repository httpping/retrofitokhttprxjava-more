package com.mvp.base.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.widget.RadioButton;

import com.utils.log.VPLog;
import com.utils.sreen.DensityUtil;


/**
 * 带红点的RadioButton
 * 
 * @author ping
 * 
 */
public class MessageRedPointRadioView extends RadioButton {
	public String rightText;
	public String redBgColor = "#FF7A00";
	

	public MessageRedPointRadioView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initView();
	}

	public MessageRedPointRadioView(Context context) {
		super(context);
		initView();
	}

	private void initView() {
		
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		if (rightText != null) {
			
			Paint paint = new Paint();
			paint.setColor(Color.parseColor(redBgColor));
			int maxr = getWidth();
			paint.setAntiAlias(true);// 抗锯齿
			paint.setStyle(Style.FILL); // 描边
			paint.setStrokeWidth(1);
			int r = DensityUtil.dip2px(getContext(), 4.5f); // 半径

			int cx = (getWidth()+ r)/2+r;
			VPLog.d("draw_red", "cx:"+cx +" r:"+r);
			// 画圆
			canvas.drawCircle(cx, r, r, paint);
			
		}
	}
	
	@Override
	protected void onAttachedToWindow() {
		super.onAttachedToWindow();

	}
	@Override
	protected void onDetachedFromWindow() {
		super.onDetachedFromWindow();
	}

	public String getRightText() {
		return rightText;
	}

	public void setRightText(String rightText) {
		this.rightText = rightText;
		invalidate();
	}

	public String getRedBgColor() {
		return redBgColor;
	}

	public void setRedBgColor(String redBgColor) {
		this.redBgColor = redBgColor;
		invalidate();
	}

}
