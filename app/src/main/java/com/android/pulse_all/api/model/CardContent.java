package com.android.pulse_all.api.model;

import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * Created by angleterry on 2017/3/25.
 */

public class CardContent extends DataContent {

    @Expose
    public List<Topic> topics;

    @Expose
    public List<Card> cards;
}
