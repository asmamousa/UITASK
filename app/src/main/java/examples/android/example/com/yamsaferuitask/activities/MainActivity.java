package examples.android.example.com.yamsaferuitask.activities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.WindowManager;

import java.util.List;

import examples.android.example.com.yamsaferuitask.adapters.HotelInfoAdapter;
import examples.android.example.com.yamsaferuitask.databinding.ActivityMainBinding;
import examples.android.example.com.yamsaferuitask.models.BaseCardModel;
import examples.android.example.com.yamsaferuitask.contracts.MainActivityContract;
import examples.android.example.com.yamsaferuitask.presenters.MainActivityPresenter;
import examples.android.example.com.yamsaferuitask.R;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    //interface type to be more uniformed in case we want to change the type pf presenter ex: secondActivityPresenter
    // in that cas ewe wanted to change presenter= new SecondA.... (this note for next line

    MainActivityContract.Presenter presenter;
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        //to make the status bar transparent
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        presenter = new MainActivityPresenter(this);
        presenter.getHotelDetails();


        initRecyclerView();



    }


    @Override
    public void setViewData(List<BaseCardModel> baseCardModels) {

        HotelInfoAdapter adapter = new HotelInfoAdapter(baseCardModels);

        activityMainBinding.mainActivityRecyclerView.setAdapter(adapter);
    }

    @Override
    public void initRecyclerView() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        activityMainBinding.mainActivityRecyclerView.setLayoutManager(linearLayoutManager);

    }
}
