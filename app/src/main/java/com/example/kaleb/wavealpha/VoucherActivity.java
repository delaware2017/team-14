package com.example.kaleb.wavealpha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;

public class VoucherActivity extends AppCompatActivity {
    TextView showValue;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voucher);

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

        showValue = (TextView) findViewById(R.id.counter);
    }

    public void countIN (View view){
        counter++;
        showValue.setText(Integer.toString(counter));
    }
    public void countDE (View v){
        if(counter != 0)
            counter--;
        showValue.setText(Integer.toString(counter));
    }
}
