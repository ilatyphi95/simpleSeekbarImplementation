package com.ilatyphi95.simpleseekbarimplementation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int MIN_THRESHOLD = 39;
    public static final int MAX_THRESHOLD = 46;
    private TextView mTvSeekbarProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar sbProgress = findViewById(R.id.sb_progress);
        mTvSeekbarProgress = findViewById(R.id.tv_seekbar_progress);

        sbProgress.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (progress > MIN_THRESHOLD && progress < MAX_THRESHOLD) {
                    String currentValue = "Current value is " + progress;
                    mTvSeekbarProgress.setText(currentValue);
                } else {
                    mTvSeekbarProgress.setText("");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}
