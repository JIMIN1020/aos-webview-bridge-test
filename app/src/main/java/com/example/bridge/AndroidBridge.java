package com.example.bridge;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class AndroidBridge {

    private Context context;

    public AndroidBridge(Context context) {
        this.context = context;
    }

    // 웹에서 호출할 showToast 메서드
    @JavascriptInterface
    public void showToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
