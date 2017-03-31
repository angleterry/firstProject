package com.android.pulse_all.api.model;

import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * Created by angleterry on 2017/3/25.
 */

public class Video {

    /**
     * wid : 4v0oq3uryhzt3e5f
     * title : 民间小调《表哥想表妹》2-04
     * duration : 2658
     * createTime : 1443927424602
     * uploadTime : 1443974369796
     * watchCount : 112253
     * videoSize : 336*252
     * favCount : 6216
     * flashUrl : http://player.youku.com/player.php/sid/XMTM1MTQyMDk3Ng==/v.swf
     * preview : http://picstat.waqu.com/is/preview/4v0oq3uryhzt3e5f
     * bigImgUrl : http://picstat.waqu.com/is/img/4v0oq3uryhzt3e5f?sid=863435032980256
     * imgUrl : http://picstat.waqu.com/is/smallimg/4v0oq3uryhzt3e5f?sid=863435032980256
     * urls : [{"url":"http://picstat.waqu.com/is/v/a2/4v0oq3uryhzt3e5f","type":14},{"url":"http://v.youku.com/v_show/id_XMTM1MTQyMDk3Ng==.html","type":8}]
     * downloadUrls : [{"url":"http://picstat.waqu.com/is/v/a2/4v0oq3uryhzt3e5f","type":14},{"url":"http://v.youku.com/v_show/id_XMTM1MTQyMDk3Ng==.html","type":8}]
     * loop : false
     * slow : false
     * topicids : ["548fe17084b5e364452e4c84"]
     * type : 0
     * url : http://v.youku.com/v_show/id_XMTM1MTQyMDk3Ng==.html
     * download_url : http://picstat.waqu.com/ss/4v0oq3uryhzt3e5f
     * playTime : 0
     * offlineBySite : 0
     * qdid : 562e2db8522aa925657d2547
     * saved : false
     * updateTime : 1490437625978
     * commentCount : 16
     * upvoteNum : 0
     * hd : 0
     */

    @Expose
    public String wid;
    @Expose
    public String title;
    @Expose
    public int duration;
    @Expose
    public long createTime;
    @Expose
    public long uploadTime;
    @Expose
    public int watchCount;
    @Expose
    public String videoSize;
    @Expose
    public int favCount;
    @Expose
    public String flashUrl;
    @Expose
    public String preview;
    @Expose
    public String bigImgUrl;
    @Expose
    public String imgUrl;
    @Expose
    public boolean loop;
    @Expose
    public boolean slow;
    @Expose
    public int type;
    @Expose
    public String url;
    @Expose
    public String download_url;
    @Expose
    public int playTime;
    @Expose
    public int offlineBySite;
    @Expose
    public String qdid;
    @Expose
    public boolean saved;
    @Expose
    public long updateTime;
    @Expose
    public int commentCount;
    @Expose
    public int upvoteNum;
    @Expose
    public int hd;
    @Expose
    public List<String> topicids;
}
