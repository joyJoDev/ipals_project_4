package com.example.avatarmind.robotmotion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {

    private ImageView mTitleBack;

    private Button mBtnTellAJoke;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getActionBar() != null) {
            getActionBar().hide();
        }

        initView();
        initListener();
    }

    private void initView() {
        setContentView(R.layout.activity_main);

        mTitleBack = (ImageView) findViewById(R.id.common_title_back);
        mBtnTellAJoke = (Button) findViewById(R.id.main_tell_joke);

    }

    private void initListener() {
        mTitleBack.setOnClickListener(this);
        mBtnTellAJoke.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.main_tell_joke:
                intent.setClass(MainActivity.this, HeadActivity.class);
                break;
            case R.id.common_title_back:
                finish();
                return;
            default:
                break;
        }
        startActivity(intent);
    }
}
