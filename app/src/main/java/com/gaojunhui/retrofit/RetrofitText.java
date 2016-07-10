package com.gaojunhui.retrofit;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/**
 * Created by Administrator on 2016/7/10.
 */
public interface RetrofitText {
    //http://apicloud.mob.com/v1/weather/query?province=江苏&key=14b49edf0cfb1&city=南京
    @GET("v1/weather/query?province=江苏&key=14b49edf0cfb1&city=南京")
    Call<ResponseBody> getWeatherString();
    @GET("{path}?")
    Call<ResponseBody> getWeatherParams(@Path("path") String path,@QueryMap() Map<String,String> map);
    @GET("v1/weather/query?province=江苏&key=14b49edf0cfb1&city=南京")
    Call<Weather> getWeatherJson();
    @Streaming
    @GET
    Call<ResponseBody> download(@Url String url);
}
