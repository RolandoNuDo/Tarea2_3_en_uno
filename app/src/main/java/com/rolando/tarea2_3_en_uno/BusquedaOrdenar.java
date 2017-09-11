package com.rolando.tarea2_3_en_uno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BusquedaOrdenar extends AppCompatActivity {
    Button siguiente, anterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda_ordenar);

        siguiente = (Button) findViewById(R.id.siguienteo);
        anterior = (Button) findViewById(R.id.anteriroo);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguiente = new Intent(BusquedaOrdenar.this,Numeros.class);
                startActivity(siguiente);
            }
        });
        anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent anteriror = new Intent(BusquedaOrdenar.this, MainActivity.class);
                startActivity(anteriror);
            }
        });
    }
}
