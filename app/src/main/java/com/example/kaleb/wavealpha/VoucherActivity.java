package com.example.kaleb.wavealpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;


public class VoucherActivity extends AppCompatActivity {
    TextView showValue;
    int counter;
    int balance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voucher);

        showValue = (TextView) findViewById(R.id.counter);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                balance = extras.getInt("balance");
                counter = balance;
                updateTextView(Integer.toString(counter),R.id.counter);
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

        Button generateQrCode = (Button) findViewById(R.id.generate_qr_code);
        generateQrCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),qr_code.class);
                i.putExtra("spent", counter);
                startActivity(i);
                finish();
            }
        });



    }

    public void countIN (View view){
        if(counter != balance)
            counter++;
        showValue.setText(Integer.toString(counter));
    }
    public void countDE (View v){
        if(counter != 0)
            counter--;
        showValue.setText(Integer.toString(counter));
    }

    public void updateTextView(String toThis, int view) {
        TextView textView = (TextView) findViewById(view);
        textView.setText(toThis);
    }

}
