package com.example.a27_materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton1 = findViewById(R.id.boton1);
        Button boton2 = findViewById(R.id.boton2);
        Button boton3 = findViewById(R.id.boton3);
        TextView mostrarText = findViewById(R.id.mostrarText);

    boton1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mostrarText.setText("Me encanta PSP");
        }
    });

    boton2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mostrarText.setText("Me encanta PMDM");
        }
    });

    boton3.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view) {
                mostrarText.setText("Me encanta PSP Y PMDM");
            }
        });


    }


}