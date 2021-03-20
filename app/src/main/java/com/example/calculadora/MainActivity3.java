package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private EditText X1,Y1,X2,Y2; //inicializo los pararemostros con lo que recibire los datos
    private TextView ResP; //inicializo donde mostrare los reusltados
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        X1=findViewById(R.id.X1); //asigno el campo a la variable que corresponde
        X2=findViewById(R.id.X2);
        Y1=findViewById(R.id.Y1);
        Y2=findViewById(R.id.Y2);
        ResP=findViewById(R.id.ResP); //asigno donde pondre el resultado
    }

    public void ecuPen(View view){
        String x1=X1.getText().toString(); //tomo los valores que estan en cada texnum
        String y1=Y1.getText().toString();
        String x2=X2.getText().toString();
        String y2=Y2.getText().toString();
        double numx1=Integer.parseInt(x1); //los convierto a double
        double numy1=Integer.parseInt(y1);
        double numx2=Integer.parseInt(x2);
        double numy2=Integer.parseInt(y2);

        double resu = (numy2 - numy1) / (numx2 - numx1); //formula de la pendiente

        String r=String.valueOf(resu); //los convierto en string
        ResP.setText(r); //lo mando al campos de texto

    }


    public void volver2(View view){ //metodo para ir a la pagina principal
        Intent button1 = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(button1);
    }
}