package com.android.pulse_all.api.model;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

/**
 * Created by angleterry on 2017/3/25.
 */

public abstract class DataContent implements Serializable{

    @Expose
    public boolean success;

    @Expose
    public String msg;

}
