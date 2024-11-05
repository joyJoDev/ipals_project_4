package com.example.avatarmind.robotmotion;

import android.app.Activity;
import android.os.Bundle;
import android.robot.motion.RobotMotion;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HeadActivity extends Activity implements OnClickListener {

    private ImageView mTitleBack;

    private Button mJoke1Btn;

    private Button mJoke2Btn;

    private Button mJoke3Btn;

    private Button mJoke4Btn;

    private Button mJoke5Btn;

    private RobotMotion mRobotMotion = new RobotMotion();

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
        setContentView(R.layout.activity_head);

        mTitleBack = (ImageView) findViewById(R.id.common_title_back);
        TextView title = (TextView) findViewById(R.id.common_title_text);
        title.setText(R.string.unit_head);

        mJoke1Btn = (Button) findViewById(R.id.joke_1);
        mJoke2Btn = (Button) findViewById(R.id.joke_2);
        mJoke3Btn = (Button) findViewById(R.id.joke_3);
        mJoke4Btn = (Button) findViewById(R.id.joke_4);
        mJoke5Btn = (Button) findViewById(R.id.joke_5);
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
            case R.id.joke_4:
                mRobotMotion.nodHead();
                break;
            case R.id.joke_5:
                mRobotMotion.shakeHead();
                break;
            default:
                break;
        }

    }

}
