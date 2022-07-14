package com.example.material_design;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity_1 extends AppCompatActivity {
    // abysna ui-da ulanyljak elementler hersi ayratylykda girizilyar
    private ConstraintLayout parent;
    private Button btnShowSnackbar;
    private MaterialCardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snackbar_cardview);

        // ulanyljak elementlerin idleri tanadylyar
        parent = findViewById(R.id.parent);
        btnShowSnackbar = findViewById(R.id.button);
        cardView = findViewById(R.id.cardView);

        // cardView basylanda Tost cykarya
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity_1.this, "Card Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // btnShowSnackbar duwmesine basylanda showSnackbar funksiyasy islap baslaya
        btnShowSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnackbar(); // funksiya askda berlendir
            }
        });

    }

    // showSnackbar funsiyanyn icinde muna degisli bolan effektleri edip bolyar
    private void showSnackbar(){
        Snackbar.make(parent, "This is a Snackbar", Snackbar.LENGTH_INDEFINITE)
                .setAction("Rerty", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Snackbardaky rerty duwmesine basylanda tost cykya
                        Toast.makeText(MainActivity_1.this, "Rerty Clicked", Toast.LENGTH_SHORT).show();
                    }
                })
                .setActionTextColor(Color.WHITE) // Rerty yazgyly duwmanin renki
                .setTextColor(Color.WHITE) // Snackbardaky (This is Snackbar) tekstin renki
                .show();
    }
}
