package com.perry.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view) {
        switch (view.getId()) {
            case R.id.button:
                NormalActivity.start(this);
                break;
        }
    }
}
