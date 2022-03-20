package com.example.lyricsfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private EditText edtArtistName ;
    private EditText edtSongName;
    private Button findLyricsBtn ;
    private TextView txtLyrcis;
    private RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtArtistName = findViewById(R.id.edtArtistName);
        edtSongName = findViewById(R.id.edtSongName);
        findLyricsBtn = findViewById(R.id.findLyricsBtn);
        txtLyrcis = findViewById(R.id.lyricsTextView);

        findLyricsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                URL url = "https://api.lyrics.ovh/v1/" +
            }
        });
    }


}