package com.example.avatarmind.robotmotion;

import android.app.Activity;
import android.view.View;
import android.os.Bundle;
import android.robot.motion.RobotMotion;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class JokeActivity extends Activity implements View.OnClickListener {

    private ImageView mTitleBack;

    private Button mJoke1Btn;

    private Button mJoke2Btn;

    private Button mJoke3Btn;

    private Button mJoke4Btn;

    private Button mJoke5Btn;

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
        setContentView(R.layout.activity_joke);
        mTitleBack = (ImageView) findViewById(R.id.common_title_back);
        TextView title = (TextView) findViewById(R.id.common_title_text);
        title.setText(R.string.unit_tell_joke);

        mJoke1Btn = (Button) findViewById(R.id.main_joke1);
        mJoke2Btn = (Button) findViewById(R.id.main_joke2);
        mJoke3Btn = (Button) findViewById(R.id.main_joke3);
        mJoke4Btn = (Button) findViewById(R.id.main_joke4);
        mJoke5Btn = (Button) findViewById(R.id.main_joke5);
    }

    private void initListener() {
        mTitleBack.setOnClickListener(this);
        mJoke1Btn.setOnClickListener(this);
        mJoke2Btn.setOnClickListener(this);
        mJoke3Btn.setOnClickListener(this);
        mJoke4Btn.setOnClickListener(this);
        mJoke5Btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.common_title_back:
                finish();
                break;
            case R.id.main_joke1:
                //mRobotMotion.joke1();
                break;
            case R.id.main_joke2:
                //mRobotMotion.joke2();
                break;
            case R.id.main_joke3:
                //mRobotMotion.joke3();
                break;
            case R.id.main_joke4:
                //mRobotMotion.joke4();
                break;
            case R.id.main_joke5:
                //mRobotMotion.joke5();
                break;
            default:
                break;
        }

    }
}
