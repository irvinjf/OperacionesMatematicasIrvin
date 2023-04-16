package com.example.operacionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtn1;
    EditText txtn2;
    Button btnsuma, btnresta, btnmulti, btndivi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtn1 = (EditText) findViewById(R.id.txtn1);
        txtn2 = (EditText) findViewById(R.id.txtn2);

        btnsuma = (Button) findViewById(R.id.btnsumar);
        btnresta = (Button) findViewById(R.id.btnrestar);
        btnmulti = (Button) findViewById(R.id.btnmultiplicar);
        btndivi = (Button) findViewById(R.id.btndividir);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v1 = Integer.parseInt(txtn1.getText().toString());
                int v2 = Integer.parseInt(txtn2.getText().toString());

                int res= (v1 + v2);

                Toast.makeText(MainActivity.this, "El Resultado de la suma es: " + res, Toast.LENGTH_SHORT).show();
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v1 = Integer.parseInt(txtn1.getText().toString());
                int v2 = Integer.parseInt(txtn2.getText().toString());

                int res= (v1 - v2);

                Toast.makeText(MainActivity.this, "El Resultado de la resta es: " + res, Toast.LENGTH_SHORT).show();
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v1 = Integer.parseInt(txtn1.getText().toString());
                int v2 = Integer.parseInt(txtn2.getText().toString());

                int res= (v1 * v2);

                Toast.makeText(MainActivity.this, "El Resultado de la multiplicacion es: " + res, Toast.LENGTH_SHORT).show();
            }
        });

        btndivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double v1 = Integer.parseInt(txtn1.getText().toString());
                int v2 = Integer.parseInt(txtn2.getText().toString());

                double res= v1/v2;

                Toast.makeText(MainActivity.this, "El Resultado de la división es: " + res, Toast.LENGTH_SHORT).show();
            }
        });

    }
}