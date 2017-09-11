package com.rolando.tarea2_3_en_uno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BusquedaOrdenar extends AppCompatActivity {
    Button siguiente, anterior, odernar;
    EditText datos;
    TextView mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda_ordenar);

        siguiente = (Button) findViewById(R.id.siguienteo);
        anterior = (Button) findViewById(R.id.anteriroo);
        odernar = (Button) findViewById(R.id.ordenar);
        datos = (EditText) findViewById(R.id.ingresarnum);
        mostrar = (TextView) findViewById(R.id.mostraro);

        odernar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] num = convertirEntrada(datos.getText().toString());
                int[] numOrdenados = ordenar(num);

                String result = "";

                for(int i=0;i<numOrdenados.length;i++){
                    result = result + " " + String.valueOf(numOrdenados[i]);
                }
                mostrar.setText(result);
            }
        });
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

    public int[] convertirEntrada(String entrada){

        String[] entradas = entrada.split(" ");

        int[] num = new int[entradas.length];

        for(int i=0;i<entradas.length; i++){
            try{
                num[i] = Integer.parseInt(entradas[i]);
            }catch(NumberFormatException e){
                return null;
            }

        }
        return num;
    }

    public int[] ordenar(int[] num) {
        if(num == null){
            Toast.makeText(this, "ERROR: Solo Numeros Pls :c", Toast.LENGTH_SHORT).show();
            return new int[]{};
        }

        for(int i = 0; i < num.length - 1; i++)
        {
            for(int j = 0; j < num.length - 1; j++)
            {
                if (num[j] > num[j + 1])
                {
                    int tmp = num[j+1];
                    num[j+1] = num[j];
                    num[j] = tmp;
                }
            }
        }
        return num;
    }

}
