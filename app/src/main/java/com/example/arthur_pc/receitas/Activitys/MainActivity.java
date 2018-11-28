package com.example.arthur_pc.receitas.Activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.arthur_pc.receitas.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView bolo = findViewById(R.id.listaBolos);
        TextView prato = findViewById(R.id.listaPratos);
        TextView paes = findViewById(R.id.listaPaes);


        bolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, BoloActivity.class);
                startActivity(it);
            }
        });

        prato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, PratosActivity.class);
                startActivity(it);
            }
        });

        paes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, PaesActivity.class);
                startActivity(it);
            }
        });
    }
}
