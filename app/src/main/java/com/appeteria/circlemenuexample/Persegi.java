package com.appeteria.circlemenuexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Tama on 5/28/2017.
 */

public class Persegi extends AppCompatActivity {
    private EditText editTextSisi;
    private EditText editTextLuas2;
    private Button buttonHitungLuas2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegi);
        initUIII();
        initEventtt();
    }
    private void initUIII(){
        editTextSisi =(EditText) findViewById(R.id.editTextDiagonal);
        editTextLuas2 =(EditText) findViewById(R.id.editTextLuas2);
        buttonHitungLuas2 = (Button) findViewById(R.id.buttonHitungLuas2);

    }
    private void initEventtt(){
        buttonHitungLuas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
            }
        });
    }

    private void hitungLuas(){
        int sisi = Integer.parseInt(editTextSisi.getText().toString());
        int luas = sisi * sisi;
        editTextLuas2.setText(luas+"");
    }
}


