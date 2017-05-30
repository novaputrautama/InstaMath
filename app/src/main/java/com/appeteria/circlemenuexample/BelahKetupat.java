package com.appeteria.circlemenuexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Tama on 5/28/2017.
 */

public class BelahKetupat extends AppCompatActivity {
    private EditText editTextDiagonal;
    private EditText editTextDiagonal2;
    private EditText editTextLuas2;
    private Button buttonHitungLuas2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.belah_ketupat);
        initUI();
        initEvent();
    }
    private void initUI(){
        editTextDiagonal =(EditText) findViewById(R.id.editTextDiagonal);
        editTextDiagonal2 =(EditText) findViewById(R.id.editTextJari);
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
        int panjang = Integer.parseInt(editTextDiagonal.getText().toString());
        int lebar = Integer.parseInt(editTextDiagonal2.getText().toString());
        double luas = 0.5 * panjang * lebar;
        editTextLuas2.setText(luas+"");
    }

}
