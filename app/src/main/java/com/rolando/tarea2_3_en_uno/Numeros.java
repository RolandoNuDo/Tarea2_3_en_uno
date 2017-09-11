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
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);
        anterior = (Button) findViewById(R.id.ant);
        valores = (EditText) findViewById(R.id.ingresarN);
        Mostrar = (TextView) findViewById(R.id.mostrarn);
        calcular = (Button) findViewById(R.id.buscar);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dato = Integer.parseInt(valores.getText().toString());
                Mostrar.setText(String.valueOf(serienumerica(dato)));
            }
        });

        anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent anteriro = new Intent(Numeros.this, BusquedaOrdenar.class);
                startActivity(anteriro);
            }
        });
    }
    public int serienumerica(int dato) {
        int res = -1;
        for(int i = 1; i <= dato; i ++){
            if(i % 2 == 0 ){
                res += 1;
            }else {
                res += 2;
            }
        }
        return res;
    }
}
