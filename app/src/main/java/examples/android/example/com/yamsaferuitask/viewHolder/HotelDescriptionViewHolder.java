package examples.android.example.com.yamsaferuitask.viewHolder;

import examples.android.example.com.yamsaferuitask.databinding.HotelDescriptionLayoutBinding;
import examples.android.example.com.yamsaferuitask.models.HotelDescription;


class HotelDescriptionViewHolder extends BaseViewHolder {

   private HotelDescriptionLayoutBinding binding;
   private HotelDescription hotelDescription;

    HotelDescriptionViewHolder(HotelDescriptionLayoutBinding hotelDescriptionLayoutBinding, HotelDescription hotelDescription) {

        super(hotelDescriptionLayoutBinding.getRoot());

        this.binding=hotelDescriptionLayoutBinding;
        this.hotelDescription=hotelDescription;


    }

    @Override
    public void bind(){

        binding.setHotelDescription(hotelDescription);

    }

}
