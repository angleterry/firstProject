package com.android.pulse_all.ui;

import android.app.Activity;
import android.os.Bundle;

import com.android.pulse_all.PulseApplication;

import butterknife.ButterKnife;

/**
 * Created by angleterry on 2017/3/23.
 */

public abstract class BaseActivity extends Activity{

    protected BaseActivity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());
        PulseApplication.getInstance().pushActivity(this);
        mContext = this;
        ButterKnife.bind(this);
        initView();
        setListener();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        PulseApplication.getInstance().popActivity(this);
    }

    protected abstract int getLayoutId();

    public void initView(){}

    public void setListener(){}
}
