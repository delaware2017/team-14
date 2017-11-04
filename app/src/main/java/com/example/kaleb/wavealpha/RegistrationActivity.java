package com.example.kaleb.wavealpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {   //registration class for registration page

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Button signUpButton = (Button) findViewById(R.id.btn_signup);   //create a signup button
        signUpButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText email = (EditText) findViewById(R.id.input_email);        //get the required data from the fields in the app
                EditText name = (EditText) findViewById(R.id.input_name);          //for the enrollment
                EditText address = (EditText) findViewById(R.id.input_address);
                EditText phone = (EditText) findViewById(R.id.input_mobile);
                EditText password = (EditText) findViewById(R.id.input_password); // need to hash later
                EditText numFamiliy = (EditText) findViewById(R.id.input_numOfFamilyMembers);
                EditText clinicID = (EditText) findViewById(R.id.input_clinicID);
                EditText triggerTime = (EditText) findViewById(R.id.input_triggerTime);

                try {
                    Intent i = new Intent(getApplicationContext(), MainMenu.class); //use the data that the user input across activities
                    i.putExtra("name", name.getText().toString());
                    i.putExtra("email", email.getText().toString());
                    i.putExtra("address", address.getText().toString());
                    i.putExtra("phone", Integer.parseInt(phone.getText().toString()));
                    i.putExtra("password", password.getText().toString());
                    i.putExtra("numFamily", Integer.parseInt(numFamiliy.getText().toString()));
                    i.putExtra("doctorID", Integer.parseInt(clinicID.getText().toString()));
                    i.putExtra("triggerTime", Integer.parseInt(triggerTime.getText().toString()));
                    startActivity(i);
                }

                catch (Exception e){
                    Log.d("Exception", e.toString());  //Error-checking. Raise an exception!
                }
            }
        });


    }
}
