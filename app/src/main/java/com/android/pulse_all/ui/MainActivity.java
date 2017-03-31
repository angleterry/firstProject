package com.android.pulse_all.ui;

import android.view.View;
import android.widget.TextView;

import com.android.pulse_all.R;
import com.android.pulse_all.api.model.CardContent;
import com.android.pulse_all.api.request.AbsSubscriber;
import com.android.pulse_all.api.request.RetrofitUtil;
import com.android.pulse_all.listener.SubscriberOnNextListener;
import com.android.pulse_all.utils.LogUtils;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.fresco.helper.Phoenix;

import butterknife.BindView;

/**
 * Created by angleterry on 2017/3/23.
 */

public class MainActivity extends BaseActivity implements SubscriberOnNextListener<CardContent>, View.OnClickListener{


    @BindView(R.id.tv_welcome)
    TextView tvWelcome;

    @BindView(R.id.iv_demo)
    SimpleDraweeView mDraweeView;

    @BindView(R.id.iv_gif_demo)
    SimpleDraweeView mGifView;
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main_view;
    }

    @Override
    public void initView() {
        super.initView();
        String url = "http://ww3.sinaimg.cn/large/610dc034jw1f6m4aj83g9j20zk1hcww3.jpg";
        Phoenix.with(mDraweeView).load(url);

        String gitUrl = "http://img4.178.com/acg1/201506/227753817857/227754566617.gif";
        Phoenix.with(mGifView).load(gitUrl);

        LogUtils.d(gitUrl);
    }

    @Override
    public void setListener() {
        super.setListener();
        tvWelcome.setOnClickListener(this);
    }

    @Override
    public void onNext(CardContent cardContent) {
        if (cardContent != null) {
            LogUtils.d("请求数据 video 数量 = " + cardContent.cards.size());
        }
    }

    @Override
    public void onEmpty() {

    }

    @Override
    public void onClick(View v) {
        if (v == tvWelcome) {
            RetrofitUtil.getInstance().getHistory(0, 2, new AbsSubscriber<>(this, this));
        }
    }
}
