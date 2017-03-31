package com.android.pulse_all;

import android.app.Activity;
import android.app.Application;

import com.android.pulse_all.utils.LogUtils;
import com.facebook.fresco.helper.Phoenix;

import java.util.Stack;

/**
 * Created by angleterry on 2017/3/23.
 */

public class PulseApplication extends Application {

    private Stack<Activity> mActivityStack;
    private static PulseApplication mInstance;

    public static PulseApplication getInstance() {
        if (mInstance == null) {
            mInstance = new PulseApplication();
        }
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        if (mInstance == null) mInstance = this;
        Phoenix.init(this);

        initLogUtils();

        if (mActivityStack == null) mActivityStack = new Stack<Activity>();
    }

    private void initLogUtils() {
        new LogUtils.Builder()
                .setLogSwitch(BuildConfig.DEBUG)// 设置log总开关，默认开
                .setGlobalTag("CMJ")// 设置log全局标签，默认为空
                // 当全局标签不为空时，我们输出的log全部为该tag，
                // 为空时，如果传入的tag为空那就显示类名，否则显示tag
                .setLog2FileSwitch(false)// 打印log时是否存到文件的开关，默认关
                .setBorderSwitch(true)// 输出日志是否带边框开关，默认开
                .setLogFilter(LogUtils.V);// log过滤器，和logcat过滤器同理，默认Verbose
    }

    public Activity pushActivity(Activity activity) {
        return mActivityStack.push(activity);
    }

    public boolean popActivity(Activity activity) {
        return mActivityStack.remove(activity);
    }

}
