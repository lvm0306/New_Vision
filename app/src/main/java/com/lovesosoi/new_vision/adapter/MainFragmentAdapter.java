package com.lovesosoi.new_vision.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class MainFragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> mListFragment;

    public MainFragmentAdapter(FragmentManager fm, List<Fragment> mListFragment) {
        super(fm);
        this.mListFragment = mListFragment;
    }

    @Override
    public Fragment getItem(int i) {
        return mListFragment.get(i);
    }

    @Override
    public int getCount() {
        return mListFragment.size();
    }
}
