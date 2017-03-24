package com.android.firstproject;

import android.app.Activity;
import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.Stack;

/**
 * Created by angleterry on 2017/3/23.
 */

public class ProjectApplication extends Application {

    private Stack<Activity> mActivityStack;
    private static ProjectApplication mInstance;

    public static ProjectApplication getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Fresco.initialize(this);

        if (mInstance == null) mInstance = this;
        if (mActivityStack == null) mActivityStack = new Stack<Activity>();
    }

    public Activity pushActivity(Activity activity) {
        return mActivityStack.push(activity);
    }

    public boolean popActivity(Activity activity) {
        return mActivityStack.remove(activity);
    }

}
