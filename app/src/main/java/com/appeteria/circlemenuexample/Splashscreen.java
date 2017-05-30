package com.appeteria.circlemenuexample;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class Splashscreen extends AppCompatActivity {

    private GifImageView gifImageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        gifImageView = (GifImageView)findViewById(R.id.gifimageView);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setVisibility(progressBar.VISIBLE);

        //set GIFT resource
        try{
            InputStream inputStream = getAssets().open("loading.gif");
            byte[] bytes = IOUtils.toByteArray(inputStream);
            gifImageView.setBytes(bytes);
            gifImageView.startAnimation();
        }
        catch (IOException ex){

        }
        //wait dor a second and starat Activity Main
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Splashscreen.this.startActivity(new Intent(Splashscreen.this,MainActivity.class));
                Splashscreen.this.finish();
            }
        },4000);
    }
}
