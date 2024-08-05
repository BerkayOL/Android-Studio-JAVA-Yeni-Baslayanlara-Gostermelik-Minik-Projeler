package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText kullaniciadi, sifre;
    private TextView txtSonuc;
    private String kKullaniciAdi, kSifre, dogruKAdi = "Berkay", dogruKSifre = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        kullaniciadi = (EditText) findViewById(R.id.editTxtKullaniciAdi);
        sifre = (EditText) findViewById(R.id.editTxtSifre);
        txtSonuc = (TextView) findViewById(R.id.txtViewSonuc);
    }

    public void btnGirisYap(View v) {
        kKullaniciAdi = kullaniciadi.getText().toString();
        kSifre = sifre.getText().toString();
        if (!TextUtils.isEmpty(kKullaniciAdi)) {
            if (!TextUtils.isEmpty(kSifre)) {
                if (kKullaniciAdi.equals(dogruKAdi)) {
                    if (kSifre.equals(dogruKSifre)) {
                        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                        intent.putExtra("kullaniciAdi",kKullaniciAdi);
                        startActivity(intent);
                    } else
                        txtSonuc.setText("Şifreyi Yanlış Girdiniz.");
                } else
                    txtSonuc.setText("Kullanıcı Adını Yanlış Girdiniz.");
            } else
                txtSonuc.setText("Şifrenizi Boş Giremezsiniz.");
        } else
            txtSonuc.setText("Kullanıcı Adınızı Boş Giremezsiniz.");
    }
}

