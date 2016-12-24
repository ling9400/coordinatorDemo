package com.qk.coordinatordemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qk on 2016/12/24.
 */

public class ViewPagerFragment extends Fragment {

    RecyclerView recyclerView;
    String title;
    private List<String> dataList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment_viewpager, null);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewChild);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);

        Bundle b = getArguments();
        if(b != null){
            title = b.getString("title");
        }

        dataList = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            dataList.add(title);
        }

        ChildAdapter adapter = new ChildAdapter(getActivity(), dataList);
        recyclerView.setAdapter(adapter);

        return view;

    }
}
