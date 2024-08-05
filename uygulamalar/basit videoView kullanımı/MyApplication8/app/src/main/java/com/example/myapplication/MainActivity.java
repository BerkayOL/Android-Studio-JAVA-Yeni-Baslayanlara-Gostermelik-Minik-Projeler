package com.example.myapplication;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    VideoView videoView1;
    MediaController mediaController;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            videoView1 = (VideoView) findViewById(R.id.videoView);
            mediaController = new MediaController(this);
            btn = (Button)findViewById(R.id.baslat);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri Uri = android.net.Uri.parse("android.resource://"+getPackageName()+"/"+ R.raw.world);
                    videoView1.setVideoURI(Uri);
                    videoView1.setMediaController(mediaController);
                    mediaController.setAnchorView(videoView1);
                    videoView1.start();


                }
            });



        }
    }
