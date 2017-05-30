package com.appeteria.circlemenuexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Tama on 5/28/2017.
 */

public class Lingkaran extends AppCompatActivity {
    private EditText editTextJari;
    private EditText editTextLuas2;
    private Button buttonHitungLuas2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lingkaran);
        initUI();
        initEvent();
    }
    private void initUI(){
        editTextJari =(EditText) findViewById(R.id.editTextJari);
        editTextLuas2 =(EditText) findViewById(R.id.editTextLuas2);
        buttonHitungLuas2 = (Button) findViewById(R.id.buttonHitungLuas2);

    }
    private void initEvent(){
        buttonHitungLuas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
            }
        });
    }

    private void hitungLuas(){
        int jari = Integer.parseInt(editTextJari.getText().toString());
        double luas = 3.14 * jari * jari;
        editTextLuas2.setText(luas+"");
    }
}
