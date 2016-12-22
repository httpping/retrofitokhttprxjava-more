package com.utils.format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * float 格式化方法
 * @author tp
 *
 */
public class DoubleFromat {
	
	
	public static String fromat(double d,int digit,RoundingMode mode){
		  
	     BigDecimal b = new BigDecimal(d);
	     
	     String pattern ="###.";
	     for (int i = 0; i < digit; i++) {
			pattern +="#";
		}
	     DecimalFormat dd =new DecimalFormat(pattern);
	     dd.setRoundingMode(mode);
		
		return dd.format(b);
	}
	
	/**
	 * 四舍5入 
	 * @param d
	 * @param digit 位数
	 * @return
	 */
	public static String fromat(double d,int digit){
	     return fromat(d, digit,RoundingMode.FLOOR);
	}
	
	
	

}
