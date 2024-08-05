package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btnTopla=findViewById(R.id.buttonTopla);
        EditText editSayi1=findViewById(R.id.editTextSayi1);
        EditText editSayi2=findViewById(R.id.editTextSayi2);
        TextView txtSonuc=findViewById(R.id.textViewSonuc);
        btnTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayi1,sayi2,toplam;
                sayi1=Integer.parseInt(editSayi1.getText().toString());
                sayi2=Integer.parseInt(editSayi2.getText().toString());
                toplam=sayi1+sayi2;
                txtSonuc.setText("Toplam: "+toplam);
            }
        });
    }

}
