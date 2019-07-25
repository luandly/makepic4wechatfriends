package com.example.expandtextview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.expandtextview.adapter.CircleAdapter;
import com.example.expandtextview.view.ExpandTextView;
import com.example.expandtextview.view.SpaceDecoration;

import java.util.ArrayList;
import java.util.List;

/**
 * @作者: njb
 * @时间: 2019/7/22 10:53
 * @描述: 仿微信朋友圈文本显示全文与收起
 */
public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CircleAdapter circleAdapter;
    private String content = "茫茫的长白大山，浩瀚的原始森林，大山脚下，原始森林环抱中散落着几十户人家的" +
            "一个小山村，茅草房，对面炕，烟筒立在屋后边。在村东头有一个独立的房子，那就是青年点，" +
            "窗前有一道小溪流过。学子在这里吃饭，由这里出发每天随社员去地里干活。干的活要么上山伐" +
            "树，抬树，要么砍柳树毛子开荒种地。在山里，可听那吆呵声：“顺山倒了！”放树谨防回头棒！" +
            "树上的枯枝打到别的树上再蹦回来，这回头棒打人最厉害。";
    private List<String> strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initData();
        initAdapter();
    }

    /**
     * 初始化控件
     */
    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    /**
     * 初始化数据
     */
    private void initData() {
        strings = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            strings.add(content);
        }
    }

    /**
     * 设置adapter
     */
    private void initAdapter() {
        circleAdapter = new CircleAdapter(this, strings);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new SpaceDecoration(this));
        recyclerView.setAdapter(circleAdapter);
    }
}
