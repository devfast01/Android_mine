package com.example.uidesigin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_4);
    }

    public void onHelloBtnClick (View view) {
        TextView txtWelcome = findViewById(R.id.txtWelcome) ;
        txtWelcome.setText("Hello Bro");
    }
}

