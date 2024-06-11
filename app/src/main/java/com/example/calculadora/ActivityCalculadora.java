package com.example.calculadora;

import static java.lang.Integer.parseInt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class ActivityCalculadora extends AppCompatActivity {

    EditText uno,dos;
    Button suma,resta,div,multi;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculadora);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        uno = (EditText) findViewById(R.id.uno);
        dos = (EditText) findViewById(R.id.dos);

        suma = (Button) findViewById(R.id.btsuma);
        resta = (Button) findViewById(R.id.btresta);
        div = (Button) findViewById(R.id.btdiv);
        multi = (Button) findViewById(R.id.btmulti);


        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int one = parseInt(uno.getText().toString());
                int two = parseInt(dos.getText().toString());
                int R = suma(one,two);

                intent = new Intent(getApplicationContext(), Res.class);
                Bundle data = new Bundle();
                data.putString("Res", String.valueOf(R));

                intent.putExtras(data);
                startActivity(intent);

            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int one = parseInt(uno.getText().toString());
                int two = parseInt(dos.getText().toString());
                int R = resta(one,two);

                intent = new Intent(getApplicationContext(), Res.class);
                Bundle data = new Bundle();
                data.putString("Res", String.valueOf(R));

                intent.putExtras(data);
                startActivity(intent);

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int one = parseInt(uno.getText().toString());
                int two = parseInt(dos.getText().toString());
                int R = div(one,two);
                intent = new Intent(getApplicationContext(), Res.class);
                Bundle data = new Bundle();
                data.putString("Res", String.valueOf(R));

                intent.putExtras(data);
                startActivity(intent);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int one = parseInt(uno.getText().toString());
                int two = parseInt(dos.getText().toString());
                int R = multi(one,two);

                intent = new Intent(getApplicationContext(), Res.class);
                Bundle data = new Bundle();
                data.putString("Res", String.valueOf(R));

                intent.putExtras(data);
                startActivity(intent);
            }
        });
    }

    public int suma(int uno, int dos) {
        return uno + dos;
    }
    public int resta(int uno, int dos) {
        return uno - dos;
    }
    public int div(int uno, int dos) {
        return uno / dos;
    }
    public int multi(int uno, int dos) {
        return uno * dos;
    }
}