package com.example.kaleb.wavealpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class qr_code extends AppCompatActivity {

    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                counter = extras.getInt("spent");
            }
        }

        int threshold = 5;
        int width = getResources().getDisplayMetrics().widthPixels/threshold;

        ImageButton stores =(ImageButton) findViewById(R.id.stores);
        stores.setLayoutParams(new LinearLayout.LayoutParams(width,width));

        ImageButton voucher =(ImageButton) findViewById(R.id.voucher);
        voucher.setLayoutParams(new LinearLayout.LayoutParams(width,width));

        ImageButton home =(ImageButton) findViewById(R.id.home);
        home.setLayoutParams(new LinearLayout.LayoutParams(width,width));

        ImageButton calender =(ImageButton) findViewById(R.id.calendar);
        calender.setLayoutParams(new LinearLayout.LayoutParams(width,width));

        ImageButton settings =(ImageButton) findViewById(R.id.settings);
        settings.setLayoutParams(new LinearLayout.LayoutParams(width,width));

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainMenu.class);
                i.putExtra("spent", counter);
                startActivity(i);
                finish();
            }
        });


    }

}
