package com.example.expandtextview.util;

import android.content.Context;
import android.util.TypedValue;

import com.example.expandtextview.app.App;

/**
 * @作者: njb
 * @时间: 2019/8/12 18:12
 * @描述:
 */
public class Utils {
    public static int dip2px(Context context, float dpValue) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int)(dpValue * scale + 0.5F);
    }


    public static int dp2px(float dpValue) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpValue, App.getContext().getResources().getDisplayMetrics());
    }
}
