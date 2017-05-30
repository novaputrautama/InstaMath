package com.appeteria.circlemenuexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Tama on 5/28/2017.
 */

public class Segitiga extends AppCompatActivity{
    private EditText editTextAlas;
    private EditText editTextTinggi;
    private EditText editTextLuas1;
    private Button buttonHitungLuas1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segitiga);
        initUII();
        initEventt();
    }
    private void initUII(){
        editTextAlas =(EditText) findViewById(R.id.editTextDiagonal);
        editTextTinggi =(EditText) findViewById(R.id.editTextJari);
        editTextLuas1 =(EditText) findViewById(R.id.editTextLuas2);
        buttonHitungLuas1 = (Button) findViewById(R.id.buttonHitungLuas2);

    }
    private void initEventt(){
        buttonHitungLuas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
            }
        });
    }

    private void hitungLuas(){
        int alas = Integer.parseInt(editTextAlas.getText().toString());
        int tinggi = Integer.parseInt(editTextTinggi.getText().toString());
        double luas = 0.5 * alas * tinggi;
        editTextLuas1.setText(luas+"");
    }
}

