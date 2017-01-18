package com.example.retrofitokrxtest.ui.demomvp;

import android.os.Bundle;

import com.mvp.base.BaseBackMvpActivity;

public class MvpDemoActivity  extends BaseBackMvpActivity {

    private MvpDemoFragment mvpF;
    private MvpDemoFragment mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mp = MvpDemoFragment.newInstance(null);
        mp.operate = new PDemoO1();
        addFragment(mRootView.getId(),mp);
    }




}
