package com.example.kaleb.wavealpha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    User user = new User("User", "", "", 0, 0, "", false );


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Hello User!");

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras != null) {
                user.setName(extras.getString("name"));
                user.setEmail(extras.getString("email"));
                user.setAddr(extras.getString("address"));
                user.setPhoneNo(extras.getInt("phone"));
                user.setPassword(extras.getString("password"));
                user.setStatus(true);
                Log.d("Balance", Integer.toString(user.getBalance()));
                updateTextView("$" + Integer.toString(user.getBalance()), R.id.amount);
                setTitle("Hello " + user.getName() + "!");
            }
        }

        else{
            Log.d("User", "Empty");
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

        voucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),VoucherActivity.class);
                //put extra to send balance
                startActivity(i);
                finish();
            }
        });


        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), SettingsMenu.class);
                startActivity(i);
                finish();
            }
        });

    }

    public void updateTextView(String toThis, int view) {
        TextView textView = (TextView) findViewById(view);
        textView.setText(toThis);
    }

}


