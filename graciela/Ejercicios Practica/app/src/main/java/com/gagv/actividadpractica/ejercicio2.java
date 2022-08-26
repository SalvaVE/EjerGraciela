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

public class ejercicio2 extends AppCompatActivity {
    private EditText edtnu, edtnu1;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        tv1= (TextView) findViewById(R.id.textv);
        edtnu=(EditText) findViewById(R.id.edtnu);
        edtnu1=(EditText) findViewById(R.id.edtnu1);

    }
    public void calcular (View v){
        String v1 = edtnu.getText().toString();
        String v2 = edtnu1.getText().toString();
        double mes = Double.parseDouble(v2);
        mes *=0.02;
        double monto = Double.parseDouble(v1);
        double ganancias;
        ganancias = monto * mes;

        tv1.setText(String.valueOf("La ganancia de la inversion es: $"+ganancias));

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
