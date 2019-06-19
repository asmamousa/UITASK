package examples.android.example.com.yamsaferuitask.viewHolder;


import examples.android.example.com.yamsaferuitask.databinding.HotelReservationLayoutBinding;
import examples.android.example.com.yamsaferuitask.models.HotelReservationInfo;

public class HotelReservationInfoViewHolder extends BaseViewHolder {

    private HotelReservationLayoutBinding binding;
    private HotelReservationInfo hotelReservation;

    HotelReservationInfoViewHolder(HotelReservationLayoutBinding hotelReservationLayoutBinding, HotelReservationInfo hotelReservation) {
        super(hotelReservationLayoutBinding.getRoot());
        this.binding = hotelReservationLayoutBinding;

        this.hotelReservation = hotelReservation;

    }

    @Override
    public void bind() {

        hotelReservation.setNumberOfAdults(hotelReservation.getNumberOfAdults()+" adults");
        hotelReservation.setNumberOfNights(hotelReservation.getNumberOfNights()+" nights");
        hotelReservation.setNumberOfRooms(hotelReservation.getNumberOfRooms()+" rooms");
        binding.setHotelReservation(hotelReservation);
    }


}
