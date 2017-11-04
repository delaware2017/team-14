package com.example.kaleb.wavealpha;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
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

        Button stores =(Button) findViewById(R.id.stores);
        int width = getResources().getDisplayMetrics().widthPixels/threshold;
        stores.setLayoutParams(new LinearLayout.LayoutParams(width,width));

        Button voucher =(Button) findViewById(R.id.voucher);
        width = getResources().getDisplayMetrics().widthPixels/threshold;
        voucher.setLayoutParams(new LinearLayout.LayoutParams(width,width));

        Button calender =(Button) findViewById(R.id.calendar);
        width = getResources().getDisplayMetrics().widthPixels/threshold;
        calender.setLayoutParams(new LinearLayout.LayoutParams(width,width));

        Button settings =(Button) findViewById(R.id.settings);
        width = getResources().getDisplayMetrics().widthPixels/threshold;
        settings.setLayoutParams(new LinearLayout.LayoutParams(width,width));

        voucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),VoucherActivity.class);
                startActivity(i);
            }
        });

    }
}


