package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Raiz extends AppCompatActivity {

    private Button btncalcular;
    private EditText txtnumber;
    private TextView txtraiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiz);
        txtnumber = findViewById(R.id.txtnumero);
        txtraiz = findViewById(R.id.txtresultado);
        btncalcular = findViewById(R.id.btncalraiz);
        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero = Integer.parseInt(String.valueOf(txtnumber.getText()));
                numero = Math.sqrt(numero);
                txtraiz.setText("La raiz es: " + numero);
            }
        });
    }
}