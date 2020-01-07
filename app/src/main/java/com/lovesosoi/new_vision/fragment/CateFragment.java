package com.lovesosoi.new_vision.fragment;


import android.os.Bundle;

import com.gyf.barlibrary.ImmersionBar;
import com.lovesosoi.new_vision.R;
import com.lovesosoi.new_vision.base.BaseFragment;

public class CateFragment  extends BaseFragment {

    public CateFragment() {
        // Required empty public constructor
    }

    @Override
    protected void immersionInit() {

        ImmersionBar.with(this).init();
    }

    public static CateFragment newInstance() {
        CateFragment fragment = new CateFragment();
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
        return R.layout.fragment_cate;
    }


}
