package examples.android.example.com.yamsaferuitask.contracts;

import java.util.List;
import examples.android.example.com.yamsaferuitask.models.BaseCardModel;

public interface MainActivityContract {

    interface View{

        void setViewData(List<BaseCardModel> baseCardModels);
        void initRecyclerView();

    }

    interface Presenter{
        void getHotelDetails();
    }

}
