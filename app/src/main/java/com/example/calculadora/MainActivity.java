package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pasar1(View view){ //metodo para pasar a la pantalla de formula general
     Intent button1 = new Intent(MainActivity.this, MainActivity2.class);
     startActivity(button1);
    }

    public void pasar2(View view){//metodo para pasar a la pantalla de pendiente
        Intent button1 = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(button1);
    }
}