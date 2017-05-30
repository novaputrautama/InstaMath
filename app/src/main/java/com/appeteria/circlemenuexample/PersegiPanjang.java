package com.appeteria.circlemenuexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by Tama on 5/27/2017.
 */

public class PersegiPanjang extends AppCompatActivity {
    private EditText editTextPanjang;
    private EditText editTextLebar;
    private EditText editTextLuas;
    private Button buttonHitungLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegi_panjang);
        initUI();
        initEvent();
    }
    private void initUI(){
        editTextPanjang =(EditText) findViewById(R.id.editTextDiagonal);
        editTextLebar =(EditText) findViewById(R.id.editTextJari);
        editTextLuas =(EditText) findViewById(R.id.editTextLuas2);
        buttonHitungLuas = (Button) findViewById(R.id.buttonHitungLuas2);

    }
    private void initEvent(){
        buttonHitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
            }
        });
    }

    private void hitungLuas(){
        int panjang = Integer.parseInt(editTextPanjang.getText().toString());
        int lebar = Integer.parseInt(editTextLebar.getText().toString());
        int luas = panjang * lebar;
        editTextLuas.setText(luas+"");
    }
}


