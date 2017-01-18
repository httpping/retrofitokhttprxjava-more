/**   
* @Title: VpConstants.java 
* @Package com.vp.loveu.comm 
* @Description: TODO(用一句话描述该文件做什么) 
* @author zeus   
* @date 2015-10-20 下午4:28:14 
* @version V1.0   
*/
package com.baseapp.comm;


/**
 *
 * 
 * @ClassName: 常量
 * @Description:
 * @author ping
 * @date
 */
public interface VpConstants {

	public static final boolean DEVELOPER_MODE = false; // 开发模式，

	
	 
	
	// 服务器配置test
//	public static final int PORT = 9711; // 端口
//	public static final String HOST = "http://115.29.244.85:" + PORT; // IP
//	public static final String FILE_HOST = "http://115.29.244.85:9713"; // 文件上传
//
//	public static final int WEB_PORT = 9712;
//	public static final String WEB_HOST = "http://115.29.244.85:" + WEB_PORT;
//	public static final String KEY_DD = "1234567891234567"; 
 
	
	// 服务器配置product
	public static final int PORT = 80; // 端口
	public static final String HOST = "http://api.iuapp.cn:" + PORT; // IP
	public static final int WEB_PORT = 80;
	public static final String WEB_HOST = "http://g.iuapp.cn:" + WEB_PORT;
	public static final String FILE_HOST = "http://img1.iuapp.cn"; // 文件上传
	public static final String KEY_DD = "&^(*3^$#@!fdsf!#";

	
	public static final int VERSION = 10;// 版本号，用来跟服务器关联
	public static final String API_START = "/api/v1";
	
	
	public static final String KEY_QR_PASS ="lvu@&*^%#2016;<>";
	

}
