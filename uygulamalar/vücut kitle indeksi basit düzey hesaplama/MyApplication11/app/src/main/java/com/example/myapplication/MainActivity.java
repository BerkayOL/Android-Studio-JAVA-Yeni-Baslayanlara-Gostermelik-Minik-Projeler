package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    EditText boy, kilo, yas;
    TextView sonuc;
    Button btnHesapla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        boy = (EditText) findViewById(R.id.editTxtBoy);
        kilo = (EditText) findViewById(R.id.editTxtKilo);
        yas = (EditText) findViewById(R.id.editTxtYas);
        sonuc = (TextView) findViewById(R.id.txtViewSonuc);
        btnHesapla = (Button) findViewById(R.id.btnHesapla);
        btnHesapla.setOnClickListener(view ->{
            float BoyDegeri = Float.parseFloat(boy.getText().toString().trim());
            float KiloDegeri = Float.parseFloat(kilo.getText().toString().trim());
            BoyDegeri = BoyDegeri/100;
            float degersonucu = KiloDegeri/(BoyDegeri*BoyDegeri);
            if(degersonucu <= 18){
                sonuc.setText(degersonucu+""+"   Zayıf İndekstesiniz.");
            }
            if(degersonucu > 19){
                sonuc.setText(degersonucu+""+"   Kilonuz İdeal Düzeydedir.");
            }
            if(degersonucu > 30){
                sonuc.setText(degersonucu+""+"   Kilonuz Fazla.");
            }

        });

    }

    }

