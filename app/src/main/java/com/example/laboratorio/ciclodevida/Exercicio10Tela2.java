package com.example.laboratorio.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Exercicio10Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio10_tela2);
        String msg = getIntent().getStringExtra("Rsultado");
        TextView textResultado =
                (TextView) findViewById(R.id.textResultado);

        textResultado.setText(msg);
    }
}
