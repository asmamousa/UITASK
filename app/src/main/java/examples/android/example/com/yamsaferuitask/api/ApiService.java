package examples.android.example.com.yamsaferuitask.api;

import examples.android.example.com.yamsaferuitask.models.HotelInfo;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

  @GET("HotelData")
    Call<HotelInfo> getHotelInfo();


}

