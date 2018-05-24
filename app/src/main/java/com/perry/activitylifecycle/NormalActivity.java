package com.perry.activitylifecycle;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;

public class NormalActivity extends AppCompatActivity {

    public static final String TAG = "TAG lifecycle";
    private Context context = this;
    private Dialog dialog;
    private PopupWindow popupWindow;

    public static void start(Activity activity) {
        activity.startActivity(new Intent(activity, NormalActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        Log.e(TAG, " ------>>> onCreate");

        initView();
    }

    private void initView() {
        dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_layout);
        popupWindow = new PopupWindow(context);
        popupWindow.setContentView(LayoutInflater.from(context).inflate(R.layout.popupwindow_layout, null));
        popupWindow.setWidth(getResources().getDisplayMetrics().widthPixels / 2);
        popupWindow.setHeight(getResources().getDisplayMetrics().heightPixels / 2);
        popupWindow.setOutsideTouchable(true);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, " ------>>> onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, " ------>>> onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG, " ------>>> onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, " ------>>> onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, " ------>>> onPause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TAG, " ------>>> onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, " ------>>> onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, " ------>>> onDestroy");
    }

    public void onClickButton(View view) {
        switch (view.getId()) {
            case R.id.button4:
                if (dialog != null && !dialog.isShowing())
                    dialog.show();
                break;
            case R.id.button5:
                if (popupWindow != null && !popupWindow.isShowing())
                    popupWindow.showAtLocation(findViewById(R.id.button5), Gravity.CENTER, 0, 0);
                break;
            case R.id.button6:
                TranslateActivity.start(this);
                break;
        }
    }
}
