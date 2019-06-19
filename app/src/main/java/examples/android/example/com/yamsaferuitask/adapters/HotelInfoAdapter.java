package examples.android.example.com.yamsaferuitask.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import examples.android.example.com.yamsaferuitask.models.BaseCardModel;
import examples.android.example.com.yamsaferuitask.viewHolder.BaseViewHolder;

public class HotelInfoAdapter extends RecyclerView.Adapter<BaseViewHolder> {


    private List<BaseCardModel> baseCardModels;

    public HotelInfoAdapter(List<BaseCardModel> baseCardModels) {
        this.baseCardModels = baseCardModels;
    }


    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {

        return BaseViewHolder.getViewHolder(viewGroup.getContext(), baseCardModels.get(position));

    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder baseViewHolder, int i) {

        baseViewHolder.bind();

    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return baseCardModels.size();
    }
}
