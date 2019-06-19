package examples.android.example.com.yamsaferuitask.viewHolder;

import examples.android.example.com.yamsaferuitask.databinding.HotelBasicInfoLayoutBinding;
import examples.android.example.com.yamsaferuitask.models.HotelBasicInfo;


class HotelBasicInfoViewHolder extends BaseViewHolder {

    private HotelBasicInfoLayoutBinding binding;
    private HotelBasicInfo hotelBasicInfo;


    HotelBasicInfoViewHolder(HotelBasicInfoLayoutBinding hotelBasicInfoLayoutBinding, HotelBasicInfo hotelBasicInfo) {

        super(hotelBasicInfoLayoutBinding.getRoot());

        this.binding = hotelBasicInfoLayoutBinding;
        this.hotelBasicInfo = hotelBasicInfo;


    }


    @Override
    public void bind() {

        binding.setTitleInfo(hotelBasicInfo);

    }

}



