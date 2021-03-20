package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private EditText A,B,C; //inicializo los pararemostros con lo que recibire los datos
    private TextView res,res2; //inicializo donde mostrare los reusltados

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        A=findViewById(R.id.A); //asigno el campo a la variable que corresponde
        B=findViewById(R.id.B);
        C=findViewById(R.id.C);
        res=findViewById(R.id.res); //asigno donde pondre cada uno de los resultados
        res2=findViewById(R.id.res2);

    }

    public void forGene(View view){ //metodo que se ejecutara cuando se de click
        String v1=A.getText().toString(); //tomo los valores que estan en cada texnum
        String v2=B.getText().toString();
        String v3=C.getText().toString();
        double num1=Integer.parseInt(v1);//los convierto a double
        double num2=Integer.parseInt(v2);
        double num3=Integer.parseInt(v3);

        double y = (num2 * num2) - (4 * num1 * num3); //formula general
        double y2 = Math.sqrt(y);
        double x1 = (-num2 + y2)/ (2 * num1);
        double x2 = (-num2 - y2)/ (2 * num1);

        String r=String.valueOf(x1); //los convierto en string
        res.setText(r);  //los mando a los campos de texto
        String r2=String.valueOf(x2);
        res2.setText(r2);

}
    public void volver1(View view){ //metodo para ir a la pagina principal
        Intent button1 = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(button1);
    }
}