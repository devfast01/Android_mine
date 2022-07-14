package com.example.a1_first_tutorial;

import androidx.appcompat.app.AppCompatActivity;

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

    public  void onBtnClick ( View view) {
        TextView texthello = findViewById(R.id.textView) ;
        EditText edtTextName = findViewById(R.id.edtTextName) ;
        texthello.setText("Hello " + edtTextName.getText().toString()); // ilki Ayday ozin diyip durana derek basga zat bolya run edninden son uytgeya
    }
}