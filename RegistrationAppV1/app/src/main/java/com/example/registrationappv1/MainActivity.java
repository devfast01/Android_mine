package com.example.registrationappv1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textLastName,textFirstName,textEmail;
    private EditText edtFirstName,edtLastName,edtEmail;
    private ConstraintLayout parent;
    private Button btnShowSnackbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void onBtnClick ( View view) {
        textFirstName = findViewById(R.id.textFirstName);
        textLastName = findViewById(R.id.textLastName);
        textEmail = findViewById(R.id.textEmail);
        edtFirstName = findViewById(R.id.edtFirstName);
        edtLastName = findViewById(R.id.edtLastName);
        edtEmail = findViewById(R.id.edtEmail);

        textFirstName.setText(getString(R.string.firstName)+": " + edtFirstName.getText().toString());
        textLastName.setText(getString(R.string.lastName)+": " + edtLastName.getText().toString());
        textEmail.setText("Email: " + edtEmail.getText().toString());



    }

}