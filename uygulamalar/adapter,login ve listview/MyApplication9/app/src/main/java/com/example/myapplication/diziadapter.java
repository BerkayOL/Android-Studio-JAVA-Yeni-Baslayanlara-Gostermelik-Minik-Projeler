package com.example.myapplication;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class diziadapter extends ArrayAdapter<String> {
    private String[] diziler;
    private int[] bolumler;
    private int[] resimler;
    private Context context;
    private TextView diziİsmi, DiziBolumu;
    private ImageView diziResmi;

    public diziadapter(String[] diziler, int[] bolumler, int[] resimler, Context context) {
        super(context, R.layout.item, diziler);
        this.diziler = diziler;
        this.bolumler = bolumler;
        this.resimler = resimler;
        this.context = context;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, null);
        if (view != null) {
            diziİsmi = (TextView) view.findViewById(R.id.item_imageViewİsmi);
            DiziBolumu = (TextView) view.findViewById(R.id.item_imageViewBolumSayisi);
            diziResmi = (ImageView) view.findViewById(R.id.item_imageViewResim);

            diziİsmi.setText(diziler[position]);
            DiziBolumu.setText(String.valueOf(bolumler[position]));
            diziResmi.setBackgroundResource(resimler[position]);
        }
        return view;
    }
}
