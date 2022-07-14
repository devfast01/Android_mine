package com.example.listviewandspinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView citiesList;
    private Spinner studentsSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citiesList = findViewById(R.id.citiesList);
        studentsSpinner = findViewById(R.id.studentsSpinner);

        // Spinnerin elementlerini girizmeli
        ArrayList<String> students = new ArrayList<>();
        // Bu Meselem ucin rus diline terjime dine barlap gordim
        // esasy sunda (listView ucin Terjime) bu prayektde gorip bilersin
        students.add(getString(R.string.Begli));
        students.add("Jora");
        students.add("Myrat");
        students.add("Azat");
        students.add("Allaberdi");
        //  Spinnerin elementlerinin yerlesdirilisi
        ArrayAdapter<String> studentsAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                students
        );

        studentsSpinner.setAdapter(studentsAdapter);

        // Haysy element saylansa son bn baglansykly toast cykaryar
        studentsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) { // tapawudy yokdur int long daky yazgylar uytgedibermeli
                Toast.makeText(MainActivity.this, students.get(position) + " Selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final ArrayList<String> cities  = new ArrayList<>();
        cities.add("Tokyo");
        cities.add("Pariz");
        cities.add("Gonkong");
        cities.add("Moskow");
        cities.add("Berlin");

        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                cities
        );

        citiesList.setAdapter(citiesAdapter);

        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, cities.get(position) + " Selected", Toast.LENGTH_SHORT).show();
            }
        });

    }
}