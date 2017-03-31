package com.android.pulse_all.api.request;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by angleterry on 2017/3/25.
 */

public class BaseInterceptor implements Interceptor {

    //http://wwwtest.waqu.com/v4/user/getPlayHistory.json?platform=and&appName=general_video&
    // sid=863435032980256&uid=wq1487844642747bj29175120andczukw&profile=general_women&partner=0000
    // &appVersion=5.0.0&brand=OPPO&model=OPPO+A33&osVersion=22&size=30&start=0

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        //添加请求参数
        HttpUrl url=original.url().newBuilder()
                .addQueryParameter("uid", "wq1487844642747bj29175120andczukw")
                .addQueryParameter("sid", "863435032980256")
                .addQueryParameter("brand", "OPPO")
                .addQueryParameter("model", "OPPO+A33")
                .addQueryParameter("osVersion", "22")
                .addQueryParameter("platform", "and")
                .addQueryParameter("appName", "general_video")
                .build();
        //添加请求头
        Request request = original.newBuilder()
                .addHeader("Content-Type", "application/json;charset=UTF-8")
                .method(original.method(), original.body())
                .url(url)
                .build();
        return chain.proceed(request);
    }
}
