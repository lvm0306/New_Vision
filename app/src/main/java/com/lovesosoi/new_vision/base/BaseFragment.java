package com.lovesosoi.new_vision.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gyf.barlibrary.ImmersionFragment;
import com.lovesosoi.new_vision.R;

public abstract class BaseFragment extends ImmersionFragment {
    public Context mfContext;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mfContext=context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(getLayout(), container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initDate();
    }

    public abstract void init();
    public abstract void initView();
    public abstract void initDate();
    public abstract int getLayout();
}
