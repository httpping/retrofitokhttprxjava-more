package com.com.baseapp.model.remote;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * 销售宝服务器
 */
public interface XsbSerarchServ {

	

	@POST("xsbSearch/searchXsbArticle")
	Observable<String> searchXsbArticle(@Body RequestBody params);


 
}
