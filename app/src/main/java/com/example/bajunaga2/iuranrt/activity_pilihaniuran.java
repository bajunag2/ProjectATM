package com.example.bajunaga2.iuranrt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class activity_pilihaniuran extends AppCompatActivity {
    Button btnpenarikan, btnpenyetoran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihaniuran);
        btnpenyetoran = (Button) findViewById(R.id.btnpenyetoran);
        btnpenarikan = (Button) findViewById(R.id.btnpenarikan);
        btnpenarikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_pilihaniuran.this, activity_penarikan.class);
                startActivity(i);
            }
        });
        btnpenyetoran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_pilihaniuran.this, activity_penyetoran.class);
                startActivity(i);
            }
        });
    }
}