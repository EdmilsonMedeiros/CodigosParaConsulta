package com.ed.medeiros.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
//extends IntroActivity:
public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);

        //FULSCREEN:
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Disable nex and back buttons:
        setButtonBackVisible(false);
        setButtonNextVisible(false);

        //Add intro:
        addSlide(new FragmentSlide.Builder()
                .fragment(R.layout.intro1)
                .background(android.R.color.white)
                .backgroundDark(R.color.black)
                .canGoBackward(false)

                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .fragment(R.layout.intro1)
                .background(android.R.color.white)
                .backgroundDark(R.color.black)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .fragment(R.layout.intro1)
                .background(android.R.color.white)
                .backgroundDark(R.color.black)
                .canGoForward(false)
                .build()
        );


    }
}