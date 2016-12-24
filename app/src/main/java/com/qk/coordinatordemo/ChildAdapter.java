package com.qk.coordinatordemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by qk on 2016/12/24.
 */

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ChildHolder> {
    private Context myContext;
    private List<String> data;
    private LayoutInflater inflater;

    public ChildAdapter(Context myContext, List<String> data) {
        this.myContext = myContext;
        this.data = data;
        inflater = LayoutInflater.from(myContext);
    }

    @Override
    public ChildHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.adapter_child, null);
        ChildHolder holder = new ChildHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ChildHolder holder, int position) {
        String info = data.get(position);
        holder.tvChild.setText(info);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ChildHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.tvChild)
        TextView tvChild;
        public ChildHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
