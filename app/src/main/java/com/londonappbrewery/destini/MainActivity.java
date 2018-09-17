package com.londonappbrewery.destini;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mButtonTop;
    Button mButtonBottom;

    TextView mStoryTextView;

    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStory(true);
            }
        });


        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStory(false);
            }
        });

    }

    protected void updateStory(boolean top) {
        if (top) {
            switch (mStoryIndex) {
                case 1:
                {
                    mStoryIndex = 3;
                    mStoryTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                } break;
                case 2:
                {
                    mStoryIndex = 3;
                    mStoryTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                } break;
                case 3:
                {
                    mStoryIndex = 6;
                    mStoryTextView.setText(R.string.T6_End);
                    mButtonTop.setVisibility(View.INVISIBLE);
                    mButtonBottom.setVisibility(View.INVISIBLE);
                } break;
            }
        } else {
            switch (mStoryIndex) {
                case 1:
                {
                    mStoryIndex = 2;
                    mStoryTextView.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                } break;
                case 2:
                {
                    mStoryIndex = 4;
                    mStoryTextView.setText(R.string.T4_End);
                    mButtonTop.setVisibility(View.INVISIBLE);
                    mButtonBottom.setVisibility(View.INVISIBLE);
                } break;
                case 3: {
                    mStoryIndex = 5;
                    mStoryTextView.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.INVISIBLE);
                    mButtonBottom.setVisibility(View.INVISIBLE);
                } break;
            }
        }
    }
}
