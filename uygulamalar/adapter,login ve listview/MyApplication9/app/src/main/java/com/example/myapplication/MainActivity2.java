package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private TextView txtKullanici;
    private String gelenKAdi;
    private ListView mListView;
    private String[] diziler = {"Prison Break", "The Last Of Us", "Breaking Bad", "You"};
    private int[] bolumler = {5, 20, 10, 5};
    private int[] resimler = {R.drawable.prisonbreak, R.drawable.lastofus, R.drawable.breakingbad, R.drawable.you};

    private diziadapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        txtKullanici = (TextView) findViewById(R.id.txtViewKullanici);
        Intent gelenIntent = getIntent();
        gelenKAdi = gelenIntent.getStringExtra("kullaniciAdi");
        txtKullanici.setText("Merhaba:" + gelenKAdi);
        mListView = (ListView) findViewById(R.id.ListView);
        adapter = new diziadapter(diziler, bolumler, resimler, this);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), diziler[i], Toast.LENGTH_SHORT).show();




            }
        });


    }

}