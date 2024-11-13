package com.example.avatarmind.robotmotion;

import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.robot.motion.RobotPlayer;
import android.robot.speech.SpeechManager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class RobotJoke extends Activity implements View.OnClickListener {

    private static final String TAG = "RobotJoke";
    private SpeechManager mSpeechManager;
    private RobotPlayer mRobotPlayer;
    private ImageView mBtnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        mSpeechManager = (SpeechManager) this.getSystemService("speech");
        mRobotPlayer = new RobotPlayer();

        mBtnBack = (ImageView) findViewById(R.id.common_title_back);
        mBtnBack.setOnClickListener(this);
    }

    public void joke1() {
        try {
            mSpeechManager.forceStartSpeaking("Did you hear about the first restaurant to open on the moon?");
            Thread.sleep(2000);
            mSpeechManager.forceStartSpeaking("It had great food, but no atmosphere");
            playArmMotion("belly_laugh.arm");  // Plays belly laugh motion after joke
        } catch (Exception e) {
            Log.e(TAG, "Error playing joke1", e);
        }
    }

    public void joke2() {

    }

    public void joke3() {

    }

    public void joke4() {

    }

    public void joke5() {

    }

    private void playArmMotion(String fileName) {
        try {
            AssetManager assetManager = getAssets();
            InputStream inputStream = assetManager.open(fileName);
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            inputStream.close();

            mRobotPlayer.setDataSource(buffer, 0, buffer.length);
            mRobotPlayer.prepare();
            mRobotPlayer.start();

        } catch (IOException e) {
            Log.e(TAG, "Error loading .arm file", e);
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.common_title_back) {
            finish();
        }
    }
}