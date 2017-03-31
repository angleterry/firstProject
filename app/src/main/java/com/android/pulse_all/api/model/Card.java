package com.android.pulse_all.api.model;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

/**
 * Created by angleterry on 2017/3/25.
 */

public class Card implements Serializable {

    @Expose
    public Video video;

    @Expose
    public String ct;
}
