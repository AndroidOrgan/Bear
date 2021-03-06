package com.dhunter.android.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.dhunter.android.base.BaseFragment;

import java.util.List;

/**
 * Created by dhunter on 2018/6/25.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {

    private List<BaseFragment> fragmentList;

    public MainPagerAdapter(FragmentManager fm, List<BaseFragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @Override
    public int getCount() {
        return fragmentList == null ? 0 : fragmentList.size();
    }

    @Override
    public Fragment getItem(int position) {
        return (fragmentList == null || fragmentList.size() == 0) ? null : fragmentList.get(position);
    }
}