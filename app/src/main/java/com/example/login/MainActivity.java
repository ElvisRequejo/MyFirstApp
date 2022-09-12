package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvus = findViewById(R.id.tvuser);
        tvus.setText("Bienvenido "+getIntent().getStringExtra("pupil"));
    }

    public void mostrarraiz(View view){
        Intent intent1 = new Intent(this, Raiz.class);
        startActivity(intent1);
    }

    public void mostrarcomparar(View view){
        Intent intent2 = new Intent(this, Comparar.class);
        startActivity(intent2);
    }

    public void mostrarpromedio(View view){
        Intent intent3 = new Intent(this, Promedio.class);
        startActivity(intent3);
    }

    public void mostrarcalculadora(View view){
        Intent intent4 = new Intent(this, Calculadora.class);
        startActivity(intent4);
    }

    public  void  opcajero(View view){
        Intent intent5 = new Intent(this, Cajero.class);
        startActivity(intent5);
    }
}