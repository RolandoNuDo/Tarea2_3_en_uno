package com.rolando.tarea2_3_en_uno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Numeros extends AppCompatActivity {
    Button anterior;
    EditText valores;
    TextView Mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);
        anterior = (Button) findViewById(R.id.ant);


        anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent anteriro = new Intent(Numeros.this, BusquedaOrdenar.class);
                startActivity(anteriro);
            }
        });
    }
}
