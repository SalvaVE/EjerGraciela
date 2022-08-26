package com.gagv.actividadpractica;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ejercicio1 extends AppCompatActivity {
    private EditText edt;
    private TextView tev, tev1, tev2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);
        edt = (EditText) findViewById(R.id.edtn);
        tev = (TextView) findViewById(R.id.tev);
        tev1 = (TextView) findViewById(R.id.tev1);
        tev2 = (TextView) findViewById(R.id.tev2);

    }
    public void calcular (View v){
        String edtn = edt.getText().toString();
        double Mdato = Double.parseDouble(edtn);
        double ganancia;
        double precio  = 500.0;
       double costoreal =Mdato * precio*0.2;
        tev.setText(String.valueOf("Costo real del software es: $"+costoreal));

        Mdato = Mdato * precio;
        tev1.setText(String.valueOf("Costo de ventas es: $"+Mdato));
        ganancia =  Mdato - costoreal;
        tev2.setText(String.valueOf("Ganancias de ventas es: $"+ganancia));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if(id == R.id.Ejercicioonclick){
            finish();
            Intent ejercicioonclick = new Intent(this, MainActivity.class);
            startActivity(ejercicioonclick);
        }else if (id == R.id.Ejercicio1){
            finish();
            Intent ejercicio1 = new Intent(this, ejercicio1.class);
            startActivity(ejercicio1);
        }else if (id == R.id.Ejercicio2){
            finish();
            Intent ejercicio2 = new Intent(this, ejercicio2.class);
            startActivity(ejercicio2);
        }
        return super.onOptionsItemSelected(item);
    }


}
