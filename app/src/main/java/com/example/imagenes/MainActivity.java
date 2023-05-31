package com.example.imagenes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.imagenes.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ImageButton btnMorado;
    private ImageButton btnRojo;
    private ImageButton btnGris;
    private ImageButton btnNegro;
    private ImageButton btnAzul;
    private ImageButton btnVerde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        //binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setContentView(binding.getRoot());

            btnMorado = binding.imageButton;
            btnRojo = binding.imageButton2;
            btnGris = binding.imageButton3;
            btnNegro = binding.imageButton4;
            btnAzul = binding.imageButton5;
            btnVerde = binding.imageButton6;

        btnMorado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToast("Boton morado");

            }
        });
        btnRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToast("Boton Rojo");

            }
        });
        btnGris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToast("Boton Gris");

            }
        });
        btnNegro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToast("Boton Negro");

            }
        });
        btnAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToast("Boton Azul");

            }
        });
        btnVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToast("Boton Verde");

            }
        });







    }
    protected void printToast(String imgName){
        Context contexto = getApplicationContext();
        CharSequence mensaje = "La imagen es : "+imgName;
        int duracion = Toast.LENGTH_SHORT;
        Toast.makeText(contexto, mensaje, duracion).show();
    }
}