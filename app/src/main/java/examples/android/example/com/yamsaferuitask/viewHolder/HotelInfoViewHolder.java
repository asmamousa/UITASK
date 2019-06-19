package examples.android.example.com.yamsaferuitask.viewHolder;

import android.content.Context;
import com.squareup.picasso.Picasso;
import examples.android.example.com.yamsaferuitask.R;
import examples.android.example.com.yamsaferuitask.databinding.HotelImageLayoutBinding;



public class HotelInfoViewHolder extends BaseViewHolder {

   private HotelImageLayoutBinding binding;
   private String hotelImage;
   private Context context;


        HotelInfoViewHolder(HotelImageLayoutBinding hotelImageLayoutBinding, String hotelImage) {

        super(hotelImageLayoutBinding.getRoot());

        this.binding=hotelImageLayoutBinding;
        this.context=hotelImageLayoutBinding.getRoot().getContext();
        this.hotelImage=hotelImage;



    }

    @Override
    public void bind(){

        Picasso.with(context)
                .load(hotelImage)
                .error(R.drawable.no_image)
                .placeholder(R.drawable.processing)
                .into(binding.hotelImage);

    }
}
