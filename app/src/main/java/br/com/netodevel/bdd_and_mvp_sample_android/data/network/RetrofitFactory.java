package br.com.netodevel.bdd_and_mvp_sample_android.data.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author netodevel
 */
public class RetrofitFactory {

    public static Retrofit create(String baseUrl, OkHttpClient client) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(buildGson()))
                .build();
    }

    public static Retrofit create(String baseUrl) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(defaultClient())
                .addConverterFactory(GsonConverterFactory.create(buildGson()))
                .build();
    }

    public static OkHttpClient defaultClient() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(1, TimeUnit.MINUTES)
                .readTimeout(2, TimeUnit.MINUTES)
                .writeTimeout(2, TimeUnit.MINUTES).build();
        return okHttpClient;
    }

    public static Gson buildGson() {
        return new GsonBuilder().setLenient()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();
    }

}

