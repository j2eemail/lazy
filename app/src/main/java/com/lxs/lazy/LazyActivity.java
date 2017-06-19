package com.lxs.lazy;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class LazyActivity extends AppCompatActivity {

    TabLayout mTabLayout;
    ViewPager mViewpager;
    private LazyPagerAdapter pagerAdapter;
    /**
     * 页卡标题集合
     */
    private List<String> mTitleList = new ArrayList<>();
    /**
     * 页卡视图集合
     */
    private List<Fragment> mFragmentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabLayout = (TabLayout) findViewById(R.id.tl_tabs);
        mViewpager = (ViewPager) findViewById(R.id.viewpager);
        initView();
    }

    public void initView() {
        //添加页卡视图
        mFragmentList.add(new LazyFragment1());
        mFragmentList.add(new LazyFragment2());
        mFragmentList.add(new LazyFragment3());
        mFragmentList.add(new LazyFragment4());
        mFragmentList.add(new LazyFragment5());

        //添加页卡标题
        mTitleList.add("No:1");
        mTitleList.add("No:2");
        mTitleList.add("No:3");
        mTitleList.add("No:4");
        mTitleList.add("No:5");


        pagerAdapter = new LazyPagerAdapter(getSupportFragmentManager(), mFragmentList, mTitleList);
        mViewpager.setAdapter(pagerAdapter);
        mTabLayout.setupWithViewPager(mViewpager);
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
    }
}
