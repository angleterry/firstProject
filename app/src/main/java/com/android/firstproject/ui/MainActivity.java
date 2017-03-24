package com.android.firstproject.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.android.firstproject.R;

/**
 * Created by angleterry on 2017/3/23.
 */

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_view);
    }
}
