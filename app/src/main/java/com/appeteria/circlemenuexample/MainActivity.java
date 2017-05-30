package com.appeteria.circlemenuexample;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;

public class MainActivity extends AppCompatActivity {

    CircleMenu circleMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circleMenu = (CircleMenu) findViewById(R.id.circle_menu);

        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.mipmap.icon_menu, R.mipmap.icon_cancel);
        circleMenu.addSubMenu(Color.parseColor("#258CFF"), R.mipmap.icon_segipanjang)
                .addSubMenu(Color.parseColor("#30A400"), R.mipmap.icon_segitiga)
                .addSubMenu(Color.parseColor("#FF4B32"), R.mipmap.icon_persegi)
                .addSubMenu(Color.parseColor("#8A39FF"), R.mipmap.icon_belahketupat)
                .addSubMenu(Color.parseColor("#FF6A00"), R.mipmap.icon_lingkaran);


        circleMenu.setOnMenuSelectedListener(new OnMenuSelectedListener() {

                                                 @Override
                                                 public void onMenuSelected(int index) {
                                                     switch (index) {
                                                         case 0:
                                                             Toast.makeText(MainActivity.this, "Rectangle Button Clicked", Toast.LENGTH_SHORT).show();
                                                             startActivity(new Intent(MainActivity.this, PersegiPanjang.class));
                                                             break;
                                                         case 1:
                                                             Toast.makeText(MainActivity.this, "Segitiga button Clicked", Toast.LENGTH_SHORT).show();
                                                             startActivity(new Intent(MainActivity.this, Segitiga.class));
                                                             break;
                                                         case 2:
                                                             Toast.makeText(MainActivity.this, "Persegi button Clciked", Toast.LENGTH_SHORT).show();
                                                             startActivity(new Intent(MainActivity.this, Persegi.class));
                                                             break;
                                                         case 3:
                                                             Toast.makeText(MainActivity.this, "BelahKetupat button Clcked", Toast.LENGTH_SHORT).show();
                                                             startActivity(new Intent(MainActivity.this, BelahKetupat.class));
                                                             break;
                                                         case 4:
                                                             Toast.makeText(MainActivity.this, "Lingkaran button Clicked", Toast.LENGTH_SHORT).show();
                                                             startActivity(new Intent(MainActivity.this, Lingkaran.class));
                                                             break;
                                                     }
                                                 }
                                             }

        );

        circleMenu.setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {

                                                     @Override
                                                     public void onMenuOpened() {

                                                     }

                                                     @Override
                                                     public void onMenuClosed() {
                                            
                                                     }
                                                 }
        );
    }

    @Override
    public void onBackPressed() {
        if (circleMenu.isOpened())
            circleMenu.closeMenu();
        else
            finish();
    }

}
