package com.lovesosoi.new_vision.fragment;


import android.os.Bundle;

import com.lovesosoi.new_vision.R;
import com.lovesosoi.new_vision.base.BaseFragment;


public class MainFragment extends BaseFragment {

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    protected void immersionInit() {

    }


    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void init() {

    }

    @Override
    public void initView() {

    }

    @Override
    public void initDate() {

    }

    @Override
    public int getLayout() {
        return R.layout.fragment_main;
    }

}
