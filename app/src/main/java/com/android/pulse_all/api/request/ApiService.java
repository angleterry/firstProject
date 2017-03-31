package com.android.pulse_all.api.request;

import com.android.pulse_all.api.model.CardContent;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by angleterry on 2017/3/25.
 */

public interface ApiService {

    @GET("v4/user/getPlayHistory.json")
    Observable<CardContent> getHistory(@Query("start") int start, @Query("size") int size);
}
