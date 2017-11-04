package zp.com.zpnew50demo.activity;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import zp.com.zpnew50demo.R;

/**
 * Created by Administrator on 2017/11/4 0004.
 */

public class ZpRecyclerViewAdapter extends RecyclerView.Adapter<ZpRecyclerViewAdapter.ZpViewHolder> {

    private Context context;

    private ArrayList<String> datas = new ArrayList<>();

    public ZpRecyclerViewAdapter(Context context, ArrayList<String> list) {
        this.context = context;
        this.datas = list;
    }

    @Override
    public ZpViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        ZpViewHolder zpViewHolder = new ZpViewHolder(LayoutInflater.from(context).inflate(R.layout.rec_adapter, parent, false));

        return zpViewHolder;
    }

    @Override
    public void onBindViewHolder(ZpViewHolder holder, int position) {

        holder.tv_item.setText(datas.get(position));
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class ZpViewHolder extends RecyclerView.ViewHolder {

        public TextView tv_item;

        public ZpViewHolder(View itemView) {
            super(itemView);
            tv_item = (TextView) itemView.findViewById(R.id.tv_item);
        }
    }
}
