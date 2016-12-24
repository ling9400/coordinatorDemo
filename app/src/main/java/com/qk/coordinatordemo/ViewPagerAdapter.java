package com.qk.coordinatordemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by qk on 2016/12/24.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private List<String> data;

    public ViewPagerAdapter(FragmentManager fm, List<String> data) {
        super(fm);
        this.data = data;
    }

    @Override
    public Fragment getItem(int position) {
        ViewPagerFragment fragment = new ViewPagerFragment();
        String info = data.get(position);
        Bundle bundle = new Bundle();
        bundle.putString("title", info);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return data.get(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }
}
