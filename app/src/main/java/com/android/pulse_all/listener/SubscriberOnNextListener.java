package com.android.pulse_all.listener;

/**
 * Created by angleterry on 2017/3/25.
 */

public interface SubscriberOnNextListener<T> {

    void onNext(T t);
    void onEmpty();
}
