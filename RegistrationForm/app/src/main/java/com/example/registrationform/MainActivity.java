package com.example.registrationform;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegisterBtnClick (View view) {
        TextView txtFirstName = findViewById(R.id.textFirstName);
        TextView txtLastName = findViewById(R.id.TextLastName);
        TextView txtEmail = findViewById(R.id.TextEmail);

        EditText edtTxtFirstName = findViewById(R.id.edtTextFirstName) ;
        EditText edtTxtLastName = findViewById(R.id.edtTextFirstName);
        @SuppressLint("WrongViewCast") EditText edtTxtEmail = findViewById(R.id.edttextEmail);

        txtFirstName.setText("First Name: " + edtTxtFirstName.getText().toString());
        txtLastName.setText("Last Name: " + edtTxtLastName.getText().toString());
        txtEmail.setText("Email: " + edtTxtEmail.getText().toString());


    }

}