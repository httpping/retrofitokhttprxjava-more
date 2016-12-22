package com.example.retrofitokrxtest;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.example.retrofitokrxtest.demo.DataManager;
import com.example.retrofitokrxtest.demo.SearchDataManager;
import com.example.retrofitokrxtest.demo.TestDataManager;
import com.example.retrofitokrxtest.xsbtest.Contents;
import com.example.retrofitokrxtest.xsbtest.RRSubscri;
import com.example.retrofitokrxtest.xsbtest.remote.entity.LoginBean;
import com.tpnet.params.VpRequestParams;
import com.tpnet.remote.RSubscriber;
import com.utils.log.NetLog;
import com.utils.ui.BaseActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class DemoMainActivity extends BaseActivity {
	public static final String tag = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//test3MutilBody();

				if (TextUtils.isEmpty(Contents.TOKEN)){
					test2();
				}else{
					test3();
				}

			}
		});

	}

	public void test3MutilBody(){
		VpRequestParams  params = new VpRequestParams();
		params.put("pageNumber",1+"");
		params.put("pageSize",3+"");
		params.put("type","1");
		params.put("cityName","昆明");
		TestDataManager.Shop().doSearch().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RSubscriber<String>() {
			@Override
			public void onNext(String s) {
				NetLog.d(tag, s);
			}
		});

	}


	private void test3() {
		VpRequestParams  params = new VpRequestParams();
		params.put("pageNumber",1+"");
		params.put("pageSize",3+"");
		params.put("type","1");
		params.put("cityName","昆明");
		params.setJsonParams(true);

		SearchDataManager.SearchServ().searchXsbArticle(params.createRequestBody()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RSubscriber<String>() {
			@Override
			public void onNext(String s) {
				NetLog.d(tag, s);
			}
		});



	}


	public void test2(){
		Map<String,String> params = new HashMap<>();
		params.put("username","13888678188");
		params.put("password","678188");
		DataManager.XsbServ().VerifyAccount(params).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RRSubscri<LoginBean>(this) {
					/*@Override
					public void onStart() {
						super.onStart();
						NetLog.d(tag, "onStart: " + Thread.currentThread().getName());
					}

					@Override
					public void onCompleted() {
						NetLog.d(tag, "onCompleted: " + Thread.currentThread().getName());

					}*/

			@Override
			public void onError(Throwable arg0) {
				super.onError(arg0);
				arg0.printStackTrace();
				NetLog.d(tag, arg0 +"");
			}

			@Override
			public void onNext(LoginBean arg0) {
				NetLog.d(tag, "onNext: " + Thread.currentThread().getName());
				NetLog.d(tag, arg0 +"" );

				NetLog.d(tag, arg0 +"" + arg0.Data.token);
				Contents.TOKEN = arg0.Data.token;
			}
		});
	}


	public void test1(){
		DataManager.Shop().doSearch().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RSubscriber<String>() {
					/*@Override
					public void onStart() {
						super.onStart();
						NetLog.d(tag, "onStart: " + Thread.currentThread().getName());
					}

					@Override
					public void onCompleted() {
						NetLog.d(tag, "onCompleted: " + Thread.currentThread().getName());

					}*/

			@Override
			public void onError(Throwable arg0) {
				super.onError(arg0);
				arg0.printStackTrace();
				NetLog.d(tag, arg0 +"");
			}

			@Override
			public void onNext(String arg0) {
				NetLog.d(tag, "onNext: " + Thread.currentThread().getName());
				NetLog.d(tag, arg0 +"");
			}
		});
	}



    
    public void postGson(){
     	/*VpRequestParams params = new VpRequestParams();
        params.put("name", "tanpxxx====post");
        params.put("age", "谭平sssssdf");
        params.put("sex", 1);
        params.put("中文key", "中文value");
        params.putJsonParams("{\"a\":100}");
        VpHttpClient.getDemoIn().postFromGson(VpHttpClient.createRequestBody(params)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<CustomBean>() {

			@Override
			public void onCompleted() {
	    		NetLog.d(tag, "onStart: " + Thread.currentThread().getName());

			}

			@Override
			public void onError(Throwable arg0) {
				arg0.printStackTrace();
				NetLog.d(tag, arg0 +"");
			}

			@Override
			public void onNext(CustomBean arg0) {
				NetLog.d(tag, arg0 +"" + arg0.url +" " + arg0.form.name +" " + arg0.form.age);
				NetLog.d(tag, arg0.mujson.toString());
			}
		}); */
        
      //  VpHttpClient.getDemoIn().postFrom(VpHttpClient.createRequestBody(params)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(resultObserver);
	
    }



    
    public void postFrom() throws JSONException {
    	
    	VpRequestParams params = new VpRequestParams();
        params.put("name", "tanp post");
        params.put("age", "18");
        params.put("sex", 1);
        params.put("中文key", "中文value");
     //   params.putJsonParams("{\"a\":100}");
        //VpHttpClient.getDemoIn().postFrom(VpHttpClient.createRequestBody(params)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(resultObserver);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("key","value");
		//VPNetWork.getDemoIn().doSearch(jsonObject.toString()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(resultObserver);
	}



    
    public  void postFileTest() throws IOException{
    	String path ="/sdcard/loveu/s3.jpg";
    	path ="/sdcard/loveu/text3.txt";
    	
    	File file = new File(path);
    	file.createNewFile();
    	FileOutputStream fop = new FileOutputStream(file);
    	String content = "13334";
		// get the content in bytes
		byte[] contentInBytes = content.getBytes();

		fop.write(contentInBytes);
		fop.flush();
		fop.close();

    	
    	VpRequestParams params = new VpRequestParams();
        params.put("name", "tanp post");
        params.put("age", "谭平sssssdf");
        params.put("sex", 1);
        params.put("中文key", "中文value");
       // params.putJsonParams("{}");
		//params.put("file1", file);
		params.put("f1", file );
		params.put("f3", file );
		
	//	VPNetWork.getDemoIn().uploadFile(VPNetWork.createFileRequestBody(params)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(resultObserver);


    }
    
    
    
    Observer<String> resultObserver = new Subscriber<String>() {
    	@Override
    	public void onStart() {
    		super.onStart();
    		NetLog.d(tag, "onStart: " + Thread.currentThread().getName());
    	}
    	
		@Override
		public void onCompleted() {
    		NetLog.d(tag, "onCompleted: " + Thread.currentThread().getName());

		}

		@Override
		public void onError(Throwable arg0) {
			// TODO Auto-generated method stub
			arg0.printStackTrace();
			NetLog.d(tag, arg0 +"");
		}

		@Override
		public void onNext(String arg0) {
			NetLog.d(tag, "onNext: " + Thread.currentThread().getName());
			NetLog.d(tag, arg0 +"");
		}
	};
 
}
