package examples.android.example.com.yamsaferuitask.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelBasicInfo {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("city")
    @Expose
    private String city;

    public String getTitle() {
        return title;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }


}
