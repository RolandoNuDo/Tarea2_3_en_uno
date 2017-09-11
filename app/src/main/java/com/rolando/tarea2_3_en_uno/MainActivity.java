package com.rolando.tarea2_3_en_uno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText ingresar;
    Button calcular;
    TextView mostrar;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next = (Button) findViewById(R.id.siguientef);
        ingresar = (EditText) findViewById(R.id.ingresar);
        calcular = (Button) findViewById(R.id.calcular);
        mostrar = (TextView) findViewById(R.id.mostrarf);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar.setText(fibonacci(Integer.parseInt(ingresar.getText().toString())));
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MainActivity.this, BusquedaOrdenar.class);
                startActivity(next);
            }
        });
    }
    private String fibonacci (int n){
        String text = "";
        ArrayList<BigInteger> fib = new ArrayList<>();
        BigInteger primero = new BigInteger("0");
        BigInteger segundo = new BigInteger("1");
        fib.add(primero);
        fib.add(segundo);
        for(int i = 1; i < n; i++){
            fib.add(fib.get(i).add(fib.get(i-1)));
        }
            text = "" + fib.get(n);
    return  text;
    }

}
