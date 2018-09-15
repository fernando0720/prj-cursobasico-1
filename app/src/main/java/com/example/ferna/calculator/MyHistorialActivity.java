package com.example.ferna.calculator;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyHistorialActivity extends AppCompatActivity{

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_historial);

        textView = (TextView) findViewById(R.id.captura);

        SharedPreferences resultado = getSharedPreferences ("Historial de operaciones", Context.MODE_PRIVATE);
        String valor = resultado.getString("Operaciones","No hay operaciones realizadas");

        textView.setText(valor);



    }
}
