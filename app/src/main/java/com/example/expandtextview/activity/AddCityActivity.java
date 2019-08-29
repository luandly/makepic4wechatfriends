package com.example.expandtextview.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.expandtextview.R;
import com.example.expandtextview.entity.WeatherEvent;
import com.example.expandtextview.util.RxBus;

/**
 * @作者: njb
 * @时间: 2019/8/28 18:24
 * @描述:
 */
public class AddCityActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_send);
        initView();
    }

    private void initView() {
        textView = findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RxBus.getInstance().post(new WeatherEvent("021","西安市","30℃"));
                finish();
            }
        });
    }
}
