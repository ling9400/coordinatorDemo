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

public class MDAdapter extends RecyclerView.Adapter<MDAdapter.MDHolder> {

    private Context myContext;
    private List<String> data;
    private LayoutInflater inflater;

    public MDAdapter(Context myContext, List<String> data) {
        this.myContext = myContext;
        this.data = data;
        inflater = LayoutInflater.from(myContext);
    }

    @Override
    public MDHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.adapter_md, null);
        MDHolder holder = new MDHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MDHolder holder, int position) {
        String info = data.get(position);
        holder.tvMD.setText(info);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MDHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.tvMd)
        public TextView tvMD;
        public MDHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
