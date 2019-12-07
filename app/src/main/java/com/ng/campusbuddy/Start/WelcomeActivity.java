package com.ng.campusbuddy.Start;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ng.campusbuddy.R;
import com.ng.campusbuddy.Tools.SliderAdapter;

public class WelcomeActivity extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;

    private TextView[] mDots;

    private SliderAdapter sliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        mSlideViewPager = findViewById(R.id.slideViewPager);
        mDotLayout = findViewById(R.id.dotsLayout);

        sliderAdapter = new SliderAdapter(this);
        mSlideViewPager.setAdapter(sliderAdapter);

//        addDotsIndicator();
    }

//    private void addDotsIndicator() {
//
//        mDots = new TextView[4];
//        for(int i = 0; i < mDots.length; i++){
//            mDots[i] = new  TextView(this);
//
//        }
//    }

}
