package examples.android.example.com.yamsaferuitask.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelReservationInfo {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("numberOfNights")
    @Expose
    private String numberOfNights;
    @SerializedName("numberOfAdults")
    @Expose
    private String numberOfAdults;
    @SerializedName("numberOfRooms")
    @Expose
    private String numberOfRooms;

    public String getDate() {
        return date;
    }

    public String getNumberOfNights() {
        return numberOfNights;
    }

    public String getNumberOfAdults() {
        return numberOfAdults;
    }

    public String getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfNights(String numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setNumberOfAdults(String numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public void setNumberOfRooms(String numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}


