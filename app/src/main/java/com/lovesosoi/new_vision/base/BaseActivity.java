package com.lovesosoi.new_vision.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.gyf.barlibrary.ImmersionBar;


public abstract class BaseActivity extends AppCompatActivity {

    protected ImmersionBar mImmersionBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());

        mImmersionBar = ImmersionBar.with(this);

        if (getFristTopViewId() != 0) {
            mImmersionBar.statusBarDarkFont(true, 0.2f)
                    .titleBar(getFristTopViewId())
                    .init();
        }
        init();
        initView();
        initDate();
    }
    public abstract void init();
    public abstract int getFristTopViewId();
    public abstract int getLayout();
    public abstract void initView();
    public abstract void initDate();
}
