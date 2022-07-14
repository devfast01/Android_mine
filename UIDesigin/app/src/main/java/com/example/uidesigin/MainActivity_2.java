package com.example.uidesigin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_2 extends AppCompatActivity {
//    umumy ulanylyan ulylyklary bellap goyup gerek yerinde ulanyp bolya
    private CheckBox checkBoxBegli, checkBoxMyrat, checkBoxJora;
    private RadioGroup rgMaritalStatus;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
        // Ulanjak materyallany idisi bilen bellemeli
        checkBoxBegli = findViewById(R.id.checkboxBegli);
        checkBoxMyrat = findViewById(R.id.checkboxMyrat);
        checkBoxJora = findViewById(R.id.checkboxJora);
        progressBar = findViewById(R.id.progressBar);
        rgMaritalStatus = findViewById(R.id.rgMaritalStatus);

        //Progress baryn for lup arkaly yerine yetirilisi
        Thread thread  = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0; i<10; i++) {
                    progressBar.incrementProgressBy(10);
                    SystemClock.sleep(500);
                }
            }
        });
        thread.start(); // Prograss baryn basladylyan yeri

        // Predlazenya acylanda haysy battanyn steyti true bolsa sol battana degisli tost cykarya
        // bu awtomat predlozenya islap baslanda cykya
        int chekedbutton = rgMaritalStatus.getCheckedRadioButtonId();

        switch (chekedbutton) {
            case R.id.rbMarried:
                Toast.makeText(MainActivity_2.this, "Married", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbSingle:
                Toast.makeText(MainActivity_2.this, "Single", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbInRel:
                Toast.makeText(MainActivity_2.this, "In a Relationship", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        // rgMaritalStatus battanyn basylmagyny hasaba almak
        // Haysy battan basylsa Sona degisli Tost cykya
        rgMaritalStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbMarried:
                        Toast.makeText(MainActivity_2.this, "Married", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbSingle:
                        Toast.makeText(MainActivity_2.this, "Single", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbInRel:
                        Toast.makeText(MainActivity_2.this, "In a Relationship", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }

            }
        });

        // predlozenya islap baslanynda haysy chekboxyn steyti true bolsa sona degisli tosty awtomaticeski cykaryp berya
        if (checkBoxBegli.isChecked()) {
            Toast toast_1=Toast. makeText(getApplicationContext(),"Siz Begli bilen Dususdynyz",Toast. LENGTH_SHORT);
            toast_1.show();
        }else {
            Toast toast_1=Toast. makeText(getApplicationContext(),"Siz Begli bilen dusmaly",Toast. LENGTH_SHORT);
            toast_1.show();
        }

        // checkBoxBegli  battana basylanda (Siz Begli bilen Dususdynyz) cykya galan yagdayda beyleki
        checkBoxBegli.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isCheked) {
                if (isCheked) {
                    Toast toast_1=Toast. makeText(getApplicationContext(),"Siz Begli bilen Dususdynyz",Toast. LENGTH_SHORT);
                    toast_1.show();
                }else {
                    Toast toast_1=Toast. makeText(getApplicationContext(),"Siz Begli bilen dusmaly",Toast. LENGTH_SHORT);
                    toast_1.show();
                }
            }
        });

        checkBoxMyrat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isCheked) {
                if (isCheked) {
                    Toast.makeText(MainActivity_2.this, "Siz Myrat bilen Dususdynyz", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity_2.this, "Siz Myrat bilen dusmaly", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBoxJora.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isCheked) {
                if (isCheked) {
                    Toast.makeText(MainActivity_2.this, "Siz Jora bilen Dususdynyz", Toast.LENGTH_SHORT).show();  
                }else {
                    Toast.makeText(MainActivity_2.this, "Siz Jora bilen dusmaly", Toast.LENGTH_SHORT).show();
                }
            }
        });
        
        
    }

}

