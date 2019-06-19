package examples.android.example.com.yamsaferuitask.viewHolder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import examples.android.example.com.yamsaferuitask.models.BaseCardModel;
import examples.android.example.com.yamsaferuitask.Enum.CardType;
import examples.android.example.com.yamsaferuitask.databinding.HotelBasicInfoLayoutBinding;
import examples.android.example.com.yamsaferuitask.databinding.HotelDescriptionLayoutBinding;
import examples.android.example.com.yamsaferuitask.databinding.HotelImageLayoutBinding;
import examples.android.example.com.yamsaferuitask.databinding.HotelReservationLayoutBinding;
import examples.android.example.com.yamsaferuitask.models.HotelBasicInfo;
import examples.android.example.com.yamsaferuitask.models.HotelDescription;
import examples.android.example.com.yamsaferuitask.models.HotelReservationInfo;


public abstract class BaseViewHolder extends RecyclerView.ViewHolder {


    BaseViewHolder(@NonNull View view) {

        super(view);

        RecyclerView.LayoutParams params = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(params);

        ButterKnife.bind(this, view);
    }


    public static BaseViewHolder getViewHolder(Context context, BaseCardModel model) {

        CardType cardType = model.type;
        BaseViewHolder viewHolder;

        switch (cardType) {
            case ImageCard:

                HotelImageLayoutBinding imageBinding = HotelImageLayoutBinding.inflate(LayoutInflater.from(context));

                viewHolder = new HotelInfoViewHolder(imageBinding, (String) model.value);

                break;
            case HotelBasicInfoCard:

                HotelBasicInfoLayoutBinding hotelBasicInfoLayoutBinding = HotelBasicInfoLayoutBinding.inflate(LayoutInflater.from(context));

                viewHolder = new HotelBasicInfoViewHolder(hotelBasicInfoLayoutBinding, (HotelBasicInfo) model.value);

                break;
            case HotelReservationInfoCard:

                HotelReservationLayoutBinding hotelReservationLayoutBinding = HotelReservationLayoutBinding.inflate(LayoutInflater.from(context));

                viewHolder = new HotelReservationInfoViewHolder(hotelReservationLayoutBinding, (HotelReservationInfo) model.value);
                break;

            case HotelDescriptionCard:

                HotelDescriptionLayoutBinding hotelDescriptionLayoutBinding = HotelDescriptionLayoutBinding.inflate(LayoutInflater.from(context));

                viewHolder = new HotelDescriptionViewHolder(hotelDescriptionLayoutBinding, (HotelDescription) model.value);
                break;

            default:
                return null;
        }


        return viewHolder;

    }

    //it must be abstract in order to force the children to implement it
    abstract public void bind();

}
