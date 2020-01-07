package com.lovesosoi.new_vision;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.lovesosoi.new_vision.adapter.MainFragmentAdapter;
import com.lovesosoi.new_vision.base.BaseActivity;
import com.lovesosoi.new_vision.fragment.CateFragment;
import com.lovesosoi.new_vision.fragment.MainFragment;
import com.lovesosoi.new_vision.fragment.MineFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.vp_main)
    ViewPager vpMain;
    @BindView(R.id.ll_main)
    LinearLayout llMain;
    @BindView(R.id.ll_cate)
    LinearLayout llCate;
    @BindView(R.id.ll_mine)
    LinearLayout llMine;
    @BindView(R.id.ll_main_iv)
    ImageView llMainIv;
    @BindView(R.id.ll_main_ll)
    LinearLayout llMainLl;
    @BindView(R.id.ll_cate_iv)
    ImageView llCateIv;
    @BindView(R.id.ll_cate_ll)
    LinearLayout llCateLl;
    @BindView(R.id.ll_mine_iv)
    ImageView llMineIv;
    @BindView(R.id.ll_mine_ll)
    LinearLayout llMineLl;

    //变量声明
    MainFragmentAdapter mMFAdapter = null;

    @Override
    public void init() {
        ButterKnife.bind(this);

    }

    @Override
    public int getFristTopViewId() {
        return 0;
    }

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        FragmentManager fm = getSupportFragmentManager();
        List<Fragment> mListFragment = new ArrayList<>();
        mListFragment.add(MainFragment.newInstance());
        mListFragment.add(CateFragment.newInstance());
        mListFragment.add(MineFragment.newInstance());
        mMFAdapter = new MainFragmentAdapter(fm, mListFragment);

        vpMain.setAdapter(mMFAdapter);
        vpMain.setCurrentItem(0);
        vpMain.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                changeTab(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    @Override
    public void initDate() {

    }

    @OnClick({R.id.ll_main, R.id.ll_cate, R.id.ll_mine})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_main:
                changeTab(0);
                break;
            case R.id.ll_cate:
                changeTab(1);
                break;
            case R.id.ll_mine:
                changeTab(2);
                break;
        }
    }

    /**
     * change bottom tab
     */
    private void changeTab(int tab) {
        closeTab();

        switch (tab) {
            case 0:
                vpMain.setCurrentItem(0);
                llMainLl.setBackground(getResources().getDrawable(R.drawable.shape_main_s_circle));
                llMainIv.setImageResource(R.drawable.ic_main_s);
                break;
            case 1:
                vpMain.setCurrentItem(1);
                llCateLl.setBackground(getResources().getDrawable(R.drawable.shape_main_s_circle));
                llCateIv.setImageResource(R.drawable.ic_category_s);
                break;
            case 2:
                vpMain.setCurrentItem(2);
                llMineLl.setBackground(getResources().getDrawable(R.drawable.shape_main_s_circle));
                llMineIv.setImageResource(R.drawable.ic_mine_s);
                break;
        }
    }

    private void closeTab() {
        llCateLl.setBackgroundColor(Color.parseColor("#ffffff"));
        llMainLl.setBackgroundColor(Color.parseColor("#ffffff"));
        llMineLl.setBackgroundColor(Color.parseColor("#ffffff"));
        llMainIv.setImageResource(R.drawable.ic_main_n);
        llMineIv.setImageResource(R.drawable.ic_mine_n);
        llCateIv.setImageResource(R.drawable.ic_category_n);

    }

}
