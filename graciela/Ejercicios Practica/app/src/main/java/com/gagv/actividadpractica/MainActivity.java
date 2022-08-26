package com.gagv.actividadpractica;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
            Intent ejerciciooncliclick = new Intent(this, MainActivity.class);
            startActivity(ejerciciooncliclick);
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