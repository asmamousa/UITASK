package examples.android.example.com.yamsaferuitask.presenters;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import examples.android.example.com.yamsaferuitask.factory.BaseCardFactory;
import examples.android.example.com.yamsaferuitask.models.BaseCardModel;
import examples.android.example.com.yamsaferuitask.Enum.CardType;
import examples.android.example.com.yamsaferuitask.contracts.MainActivityContract;
import examples.android.example.com.yamsaferuitask.models.HotelInfo;
import examples.android.example.com.yamsaferuitask.managers.RetrofitManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityPresenter implements MainActivityContract.Presenter, BaseCardFactory {

    private MainActivityContract.View view;
    private HotelInfo hotelInfo;

    public MainActivityPresenter(MainActivityContract.View view) {

        this.view = view;

    }


    @Override
    public void getHotelDetails() {
        //presenter gives the RetroManager what to do after execute(enqueue) the request(call)

        //just call RetrofitManager for data
        RetrofitManager.getInstance().getHotelData(new Callback<HotelInfo>() {
            @Override
            public void onResponse(Call<HotelInfo> call, Response<HotelInfo> response) {

                if (response.isSuccessful()) {

                    hotelInfo = response.body();

                    view.setViewData(getCardModels());
                }
            }

            @Override
            public void onFailure(Call<HotelInfo> call, Throwable t) {

                Log.e("main", "retrofit error" + t.toString());

            }
        });
    }

    @Override
    public List<BaseCardModel> getCardModels() {


        List<BaseCardModel> baseCardModelList = new ArrayList<>();

        BaseCardModel model = new BaseCardModel();

        model.setType(CardType.ImageCard);
        model.setValue(hotelInfo.getImage());
        baseCardModelList.add(model);

        model = new BaseCardModel();
        model.setType(CardType.HotelBasicInfoCard);
        model.setValue(hotelInfo.getHotelBasicInfo());
        baseCardModelList.add(model);

        model = new BaseCardModel();
        model.setType(CardType.HotelReservationInfoCard);
        model.setValue(hotelInfo.getReservationInfo());
        baseCardModelList.add(model);

        model = new BaseCardModel();
        model.setType(CardType.HotelDescriptionCard);
        model.setValue(hotelInfo.getHotelDescription());
        baseCardModelList.add(model);


        return baseCardModelList;
    }
}
