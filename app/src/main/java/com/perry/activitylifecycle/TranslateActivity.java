package com.perry.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TranslateActivity extends AppCompatActivity {

    public static void start(Activity activity) {
        activity.startActivity(new Intent(activity, TranslateActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);
    }
}
