package com.example.kaleb.wavealpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Button signUpButton = (Button) findViewById(R.id.btn_signup);
        signUpButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText email = (EditText) findViewById(R.id.input_email);
                EditText name = (EditText) findViewById(R.id.input_name);
                EditText address = (EditText) findViewById(R.id.input_address);
                EditText phone = (EditText) findViewById(R.id.input_mobile);
                EditText password = (EditText) findViewById(R.id.input_password); // need to hash later


                User user = new User(name.getText().toString(), email.getText().toString(),
                        address.getText().toString(), Integer.parseInt(phone.getText().toString()),
                        0, password.getText().toString(), true);
                Intent i = new Intent(getApplicationContext(), MainMenu.class);
                startActivity(i);
            }
        });


    }
}
