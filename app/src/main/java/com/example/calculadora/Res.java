package com.example.calculadora;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Res extends AppCompatActivity {

    TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_res);

        Resultado = (TextView) findViewById(R.id.Resultado);

        Bundle getDatos = getIntent().getExtras();
        String Res = getDatos.getString("Res");

        Resultado.setText(Res);

    }
}