package examples.android.example.com.yamsaferuitask.managers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import examples.android.example.com.yamsaferuitask.models.HotelInfo;
import examples.android.example.com.yamsaferuitask.api.ApiService;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {

    private static RetrofitManager instance = null;
    private static final String ROOT_URL = "https://gist.githubusercontent.com/asmamousa/115678486ec555f4bad164e27aec67fb/raw/aeec1f861e3b9fbd03ecec57a5d2a7ce1abc3234/";
    private ApiService apiService;

    private static Gson gson = new GsonBuilder()
            .setLenient()
            .create();


    private RetrofitManager() { //private to prevent creating instances from external classes

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build(); //logging

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        apiService = retrofit.create(ApiService.class);
    }

    public static RetrofitManager getInstance() { //Singleton

        if (instance == null) {
            instance = new RetrofitManager();
        }

        return instance;

    }

    public void  getHotelData(Callback<HotelInfo> callback){

        //create request and execute it and takes the action (what to do after executing the request) from the presenter
        Call<HotelInfo> call = apiService.getHotelInfo();
        call.enqueue(callback);
    }

}
