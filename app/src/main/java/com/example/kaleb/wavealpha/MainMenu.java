package com.example.kaleb.wavealpha;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int threshold = 4;

        Button b =(Button) findViewById(R.id.stores);
        int width = getResources().getDisplayMetrics().widthPixels/threshold;
        b.setLayoutParams(new LinearLayout.LayoutParams(width,width));

        b =(Button) findViewById(R.id.voucher);
        width = getResources().getDisplayMetrics().widthPixels/threshold;
        b.setLayoutParams(new LinearLayout.LayoutParams(width,width));

        b =(Button) findViewById(R.id.calendar);
        width = getResources().getDisplayMetrics().widthPixels/threshold;
        b.setLayoutParams(new LinearLayout.LayoutParams(width,width));

        b =(Button) findViewById(R.id.settings);
        width = getResources().getDisplayMetrics().widthPixels/threshold;
        b.setLayoutParams(new LinearLayout.LayoutParams(width,width));

    }
}


