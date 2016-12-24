package com.qk.coordinatordemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by qk on 2016/12/24.
 */

public class ActivityView extends AppCompatActivity {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;

    private Context myContext;
    //头部recyclerView的数据源
    private List<String> dataList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        ButterKnife.bind(this);
        myContext = ActivityView.this;
        GridLayoutManager manager = new GridLayoutManager(myContext, 4);
        recyclerView.setLayoutManager(manager);

        dataList = new ArrayList<>();
        for(int i = 0; i < 8; i++){
            dataList.add("测试" + i);
        }
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        MDAdapter mdAdapter = new MDAdapter(this, dataList);
        recyclerView.setAdapter(mdAdapter);

        ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), dataList);
        viewPager.setAdapter(pagerAdapter);

        tabLayout.setupWithViewPager(viewPager);

    }
}
