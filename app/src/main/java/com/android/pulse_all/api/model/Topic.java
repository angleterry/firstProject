package com.android.pulse_all.api.model;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.List;

/**
 * Created by angleterry on 2017/3/25.
 */

public class Topic implements Serializable{


    /**
     * headline : false
     * name : 发型设计
     * lastUpdate : 1454137530172
     * videoCount : 1913
     * cid : 5350fdaae8912573de7d5193
     * childrenCount : 8
     * hasChildren : true
     * likeCount : 717760
     * liked : false
     * slowPlay : 1
     * loopPlay : 0
     * zhuanjiCount : 0
     * qudanCount : 0
     * topicids : ["5350fdaae8912573de7d5193"]
     */

    @Expose
    public boolean headline;
    @Expose
    public String name;
    @Expose
    public long lastUpdate;
    @Expose
    public int videoCount;
    @Expose
    public String cid;
    @Expose
    public int childrenCount;
    @Expose
    public boolean hasChildren;
    @Expose
    public int likeCount;
    @Expose
    public boolean liked;
    @Expose
    public int slowPlay;
    @Expose
    public int loopPlay;
    @Expose
    public int zhuanjiCount;
    @Expose
    public int qudanCount;
    @Expose
    public List<String> topicids;

}
