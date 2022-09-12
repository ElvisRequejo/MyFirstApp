package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Comparar extends AppCompatActivity {
    private Button btncompararnums;
    private EditText numero1, numero2, numero3;
    private TextView txtresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparar);
        btncompararnums = findViewById(R.id.btncompararnums);
        numero1 = findViewById(R.id.primernum);
        numero2 = findViewById(R.id.segundonum);
        numero3 = findViewById(R.id.tercernum);
        txtresult = findViewById(R.id.rescomparar);
    }

    public void comparar(View view){
        int num1=Integer.parseInt(String.valueOf(numero1.getText()));
        int num2=Integer.parseInt(String.valueOf(numero2.getText()));
        int num3=Integer.parseInt(String.valueOf(numero3.getText()));
        if (num1>num2 && num1>num3){
            txtresult.setText("El número "+num1+" es mayor de todos");
        }else if(num2>num1 && num2>num3){
            txtresult.setText("El número "+num2+" es mayor de todos");
        }else if(num3>num1 && num3>num2){
            txtresult.setText("El número "+num3+" es mayor de todos");
        }else if(num3==num2 && num1==num2){
            txtresult.setText("Todos los números ingresados son iguales");
        }else if(num3==num2){
            txtresult.setText("El segundo y tercer número son iguales");
        }else if(num1==num2){
            txtresult.setText("El primer y segundo número son iguales");
        }else if(num1==num3){
            txtresult.setText("El primer y tercer número son iguales");
        }


    }
}