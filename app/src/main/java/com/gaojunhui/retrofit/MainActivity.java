package com.gaojunhui.retrofit;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.button_get_no_params)
    Button buttonGetNoParams;
    @InjectView(R.id.button_get_params)
    Button buttonGetParams;
    @InjectView(R.id.button_post)
    Button buttonPost;
    @InjectView(R.id.button_download)
    Button buttonDownload;
    @InjectView(R.id.button_upload)
    Button buttonUpload;
    RetrofitText retrofitText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        //http://apicloud.mob.com/v1/weather/query?province=江苏&key=14b49edf0cfb1&city=南京
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://apicloud.mob.com/")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
        retrofitText=retrofit.create(RetrofitText.class);
    }

    @OnClick({R.id.button_get_no_params, R.id.button_get_params, R.id.button_post, R.id.button_download, R.id.button_upload})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_get_no_params:
            getNoParams();
                break;
            case R.id.button_get_params:
                getParams();
                break;
            case R.id.button_post:
                getWeatherObj();
                break;
            case R.id.button_download:
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Call<ResponseBody> call=retrofitText.download("http://www.mingxingku.com/Data/Images/Articles/2016-03-01/4176145740.jpg");
                        try {
                            Response<ResponseBody> response=call.execute();
                            InputStream inputStream=response.body().byteStream();
                            File file=new File(Environment.getExternalStorageDirectory()+File.separator
                            +System.currentTimeMillis()+".jpg");
                            file.createNewFile();
                            FileOutputStream fos=new FileOutputStream(file);
                            byte[] bs =new byte[1024];
                            int index=inputStream.read(bs);
                            while (index!=-1){
                                fos.write(bs,0,index);
                                index=inputStream.read(bs);
                            }
                            Log.d("-------", "---------down sucess");
                            fos.flush();
                            fos.close();
                            inputStream.close();
                        } catch (IOException e) {
                            Log.d("-------", "---------down fail");

                            e.printStackTrace();
                        }

                    }
                }).start();
                break;
            case R.id.button_upload:
                break;
        }
    }
    public void getWeatherObj(){
        Call<Weather> call=retrofitText.getWeatherJson();
        call.enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                Log.i("-----", "-----"+response.body().toString());
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {

            }
        });
    }
    public void getParams(){
        //http://apicloud.mob.com/v1/weather/query?province=江苏&key=14b49edf0cfb1&city=南京
        HashMap<String,String> map=new HashMap<>();
        map.put("province","江苏");
        map.put("key","14b49edf0cfb1");
        map.put("city","南京");
        Call<ResponseBody> call=retrofitText.getWeatherParams("v1/weather/query",map);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.i("-----", "-----"+response.body().toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }
    public void getNoParams(){
        Call<ResponseBody> call=retrofitText.getWeatherString();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Log.i("-----", "-----"+response.body().toString());
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.i("-----", "----失败");
            }
        });
    }
}
