package com.example.uidesigin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity_1 extends AppCompatActivity implements View.OnClickListener {

    private TextView txtHello;
    private EditText edtTextName;

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.btnSayHello:
                System.out.println("Hello bro ");
                txtHello.setText("Hello " + edtTextName.getText().toString());
            break;
            case R.id.edtTxtName:
                Toast toast_4=Toast. makeText(getApplicationContext(),"Attempting to type something",Toast. LENGTH_SHORT);
                toast_4.show();
                break;
            case R.id.btnSalamDos:
                System.out.println("Salam Dos");
                Toast toast_1=Toast. makeText(getApplicationContext(),"Salam Dos",Toast. LENGTH_SHORT);
                toast_1.show();
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_1);

        Button btnSayHello  = findViewById(R.id.btnSayHello);
        btnSayHello.setOnClickListener(this);

        btnSayHello.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast toast_2=Toast. makeText(getApplicationContext(),"Long Click",Toast. LENGTH_SHORT);
                toast_2.show();
                return true;
            }
        });

        Button btnSalamDos  = findViewById(R.id.btnSalamDos);
        btnSalamDos.setOnClickListener(this);

        edtTextName = findViewById(R.id.edtTxtName);
        edtTextName.setOnClickListener(this);

        txtHello = findViewById(R.id.txtHello);


    }


}

