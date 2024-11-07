package com.example.avatarmind.robotmotion;


import android.app.Activity;
import android.robot.speech.SpeechManager;
import android.view.View;
import android.os.Bundle;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.speech.tts.TextToSpeech;
import android.widget.Button;
import android.widget.ImageView;

import static com.example.avatarmind.robotmotion.R.id.common_title_back;


public class RobotJoke extends Activity implements View.OnClickListener {

    private SpeechManager mSpeechManager ;

    private ImageView mBtnBack;

    //private TextToSpeech msn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        mSpeechManager = (SpeechManager) this.getSystemService("speech");
        //setupCallbacks();

        //msn = new TextToSpeech(this, this);

        mBtnBack = (ImageView) findViewById(R.id.common_title_back);
        mBtnBack.setOnClickListener(this);
    }



    public void joke1() {
        try {
            mSpeechManager.forceStartSpeaking("Did you hear about the first restaurant to open on the moon?");

            Thread.sleep(2000);

            mSpeechManager.forceStartSpeaking("It had great food, but no atmosphere");
        } catch (Exception e) {
            e.getMessage();
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case common_title_back:
                finish();
                break;
        }
    }
}
