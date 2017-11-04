package zp.com.zpnew50demo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import zp.com.zpnew50demo.R;

/**
 * Created by Administrator on 2017/11/4 0004.
 */

public class ZpXuanTingActivity extends Activity {

    private ArrayList<String> list = new ArrayList<>();

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xuan_ting);

        initData();
        initView();

    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        ZpRecyclerViewAdapter adapter = new ZpRecyclerViewAdapter(ZpXuanTingActivity.this,list);
        recyclerView.setLayoutManager(new LinearLayoutManager(ZpXuanTingActivity.this));
        recyclerView.setAdapter(adapter);

    }

    public void initData(){

        if (list != null && list.size() > 0){
            list.clear();
        }

        for (int i = 0 ; i < 30 ; i++){
            list.add("数据第 "+i+" 个条目");
        }
    }

    /**
     1.scroll:值设为scroll的View会跟随滚动事件一起发生移动；
     所有想滚动出屏幕的view都需要设置这个flag，没有设置这个flag的view将被固定在屏幕顶部。
     2.enterAlways:值设为enterAlways的View,当ScrollView往下滚动时，该View会直接往下滚动，而不用考虑ScrollView是否在滚动；
     这个flag让任意向下的滚动都会导致该view变为可见，如启用快速“返回模式”。
     3.exitUntilCollapsed:值设为exitUntilCollapsed的View，当这个View要往上逐渐“消逝”时，会一直往上滑动，直到剩下的的高度达
     到它的最小高度后，再响应ScrollView的内部滑动事件。
     4.enterAlwaysCollapsed:是enterAlways的附加选项，一般跟enterAlways一起使用，它是指，View在往下“出现”的时候，首先是enterAlways效果，
     当View的高度达到最小高度时(注意你的view需要设置minHeight属性)，View就暂时不去往下滚动，直到ScrollView滑动到顶部不再滑动时，View再继续往下滑动，
     直到滑到View的顶部结束。
     需要注意的是，后面两种模式基本只有在CollapsingToolbarLayout才有用。
     */


}
