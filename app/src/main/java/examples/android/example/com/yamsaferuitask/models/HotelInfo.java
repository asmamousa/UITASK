package examples.android.example.com.yamsaferuitask.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelInfo {

    @SerializedName("image")
    @Expose
    private String image;

    @SerializedName("hotelBasicInfo")
    @Expose
    private HotelBasicInfo hotelBasicInfo;

    @SerializedName("reservationInfo")
    @Expose
    private HotelReservationInfo reservationInfo;

    @SerializedName("hotelDescription")
    @Expose
    private HotelDescription hotelDescription;


    public String getImage() {
        return image;
    }

    public HotelBasicInfo getHotelBasicInfo() {
        return hotelBasicInfo;
    }

    public HotelReservationInfo getReservationInfo() {
        return reservationInfo;
    }

    public HotelDescription getHotelDescription() {
        return hotelDescription;
    }

}
