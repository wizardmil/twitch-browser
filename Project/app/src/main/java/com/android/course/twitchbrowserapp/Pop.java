package com.android.course.twitchbrowserapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Emil S. Kolvig-Raun on 20-04-2018.
 */

public class Pop extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popupwindow);


        DisplayMetrics display = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(display);

        int width = display.widthPixels;
        int height = display.heightPixels;


        TextView text = findViewById(R.id.textView_pop);
        text.setText(User_Preferences.getSelection());

        getWindow().setLayout((int)(width*0.7), (int)(height*0.5));
    }
}
