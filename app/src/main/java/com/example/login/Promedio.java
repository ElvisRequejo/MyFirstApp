package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Promedio extends AppCompatActivity {
    private Button btnsiguiente;
    private EditText txtnumero;
    private TextView txtresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promedio);
        btnsiguiente = findViewById(R.id.btncalc);
        txtnumero = findViewById(R.id.txtdignumber);
        txtresultado = findViewById(R.id.txtresulta);
    }

    public void calcular(View view){
        int txtnumer=Integer.parseInt(String.valueOf(txtnumero.getText()));

        if (txtnumer % 2 == 0){
            txtresultado.setText("El número "+txtnumer+" es Par");
        }else{
            txtresultado.setText("El número "+txtnumer+" es Impar");
        }
        }
    }
