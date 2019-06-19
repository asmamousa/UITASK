package examples.android.example.com.yamsaferuitask.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelDescription {

    @SerializedName("descriptionTitle")
    @Expose
    private String descriptionTitle;
    @SerializedName("descriptionContent")
    @Expose
    private String descriptionContent;

    public String getDescriptionTitle() {
        return descriptionTitle;
    }

    public String getDescriptionContent() {
        return descriptionContent;
    }


}