package com.android.pulse_all.api.request;

import android.content.Context;

import com.android.pulse_all.listener.SubscriberOnNextListener;

import rx.Subscriber;

/**
 * Created by angleterry on 2017/3/25.
 */

public class AbsSubscriber<T> extends Subscriber<T> {

    private SubscriberOnNextListener<T> mListener;
    private Context mContext;

    public AbsSubscriber(Context context, SubscriberOnNextListener listener) {
        mContext = context;
        mListener = listener;
    }

    @Override
    public void onStart() {
        super.onStart();
        unsubscribe();

    }

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        if (mListener != null) {
            mListener.onEmpty();
        }
    }

    @Override
    public void onNext(T t) {
        if (mListener != null) {
            if (t != null) {
                mListener.onNext(t);
            } else {
                mListener.onEmpty();
            }
        }
    }

}
