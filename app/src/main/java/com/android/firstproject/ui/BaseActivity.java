package com.android.firstproject.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.android.firstproject.ProjectApplication;

import butterknife.ButterKnife;

/**
 * Created by angleterry on 2017/3/23.
 */

public class BaseActivity extends Activity {

    protected BaseActivity mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ProjectApplication.getInstance().pushActivity(this);
        mContext = this;
        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ProjectApplication.getInstance().popActivity(this);
    }
}
