package com.example.reg_v3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private TextView textLastName,textFirstName,textEmail;
    private EditText edtFirstName,edtLastName,edtEmail;
    private ConstraintLayout parent;
    private Button btnShowSnackbar;
    private MaterialCardView cardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parent = findViewById(R.id.parent);
        btnShowSnackbar = findViewById(R.id.txt_button);
        cardView = findViewById(R.id.cardView);

        // cardView basylanda Tost cykarya
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Card Clicked", Toast.LENGTH_SHORT).show();
            }
        });


        btnShowSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textFirstName = findViewById(R.id.textFirstName);
                textLastName = findViewById(R.id.textLastName);
                textEmail = findViewById(R.id.textEmail);
                edtFirstName = findViewById(R.id.edtFirstName);
                edtLastName = findViewById(R.id.edtLastName);
                edtEmail = findViewById(R.id.edtEmail);

                textFirstName.setText(getString(R.string.firstName)+": " + edtFirstName.getText().toString());
                textLastName.setText(getString(R.string.lastName)+": " + edtLastName.getText().toString());
                textEmail.setText("Email: " + edtEmail.getText().toString());

                showSnackbar();
            }
        });
    }

    private void showSnackbar(){
        Snackbar.make(parent,getString(R.string.welcome) , Snackbar.LENGTH_INDEFINITE)
                .setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, getString(R.string.successfuly), Toast.LENGTH_SHORT).show();
                    }
                })
                .setActionTextColor(Color.WHITE)
                .setTextColor(Color.WHITE)
                .show();
    }


}