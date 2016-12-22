package com.example.retrofitokrxtest.xsbtest;

import java.util.HashMap;
import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

public interface DemoIn {

	
	 @GET("get")
	 Observable<String> getT(@Query("q") String query, @QueryMap HashMap<String, String> params);
	 
	 @POST("post")
	 Observable<String> postT(@QueryMap HashMap<String, String> params);
	 
	 @POST("post")
	 Observable<String> postFrom(@Body RequestBody params);
	 
	/*
	 @POST("post")
	 Observable<CustomBean> postFromGson(@Body RequestBody params);
*/
//	@FormUrlEncoded
	@Headers({"Content-Type: application/json;charset=UTF-8"})//需要添加头
	@POST("post")
	Observable<String> doSearch(@FieldMap Map<String, String> params);

	@POST("post")
	@Headers({"Content-Type: application/json;charset=UTF-8"})//需要添加头
	Observable<String> doSearch(@Body String s);

	//@HEAD("Content-Type:application/x-www-form-urlencoded;charset=UTF-8")
	@POST("post")
	Observable<String> doSearch();

	@POST("post")
	 Observable<String> uploadFile(@Body MultipartBody params);
	
 
}
