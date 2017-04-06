package com.oscarolivos.recyclerandcardviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Lista de Videojuegos

        List<Juego> juegos = new ArrayList<Juego>();

        Juego juego1 = new Juego("Nir Automata","IE Games","01/01/2017");
        juegos.add(juego1);

        Juego juego2 = new Juego("Isaac","Nicalis","20/01/2015");
        juegos.add(juego2);

        Juego juego3 = new Juego("PES2017","Desconocido","04/04/2017");
        juegos.add(juego3);

        Juego juego4 = new Juego("PES2017","Desconocido","04/04/2017");
        juegos.add(juego4);
        Juego juego5 = new Juego("PES2017","Desconocido","04/04/2017");
        juegos.add(juego5);

        Juego juego6 = new Juego("PES2017","Desconocido","04/04/2017");
        juegos.add(juego6);

        Juego juego7 = new Juego("PES2017","Desconocido","04/04/2017");
        juegos.add(juego7);

        Juego juego8 = new Juego("PES2017","Desconocido","04/04/2017");
        juegos.add(juego8);

        Juego juego10 = new Juego("PES2017","Desconocido","04/04/2017");
        juegos.add(juego10);

        Juego juego11 = new Juego("PES2017","Desconocido","04/04/2017");
        juegos.add(juego11);

        Juego juego12 = new Juego("PES2017","Desconocido","04/04/2017");
        juegos.add(juego12);

        RecyclerView reciclador = (RecyclerView)findViewById(R.id.reciclador);
        reciclador.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));

        JuegosAdapter adaptador = new JuegosAdapter(juegos,getApplicationContext());
        reciclador.setAdapter(adaptador);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id){
            case R.id.action_settings:
                //----
                Toast.makeText(getApplicationContext(), "Click en el menu Setting", Toast.LENGTH_SHORT).show();
                break;
            case R.id.otraactividad:
                Toast.makeText(getApplicationContext(), "Otra Actividad", Toast.LENGTH_SHORT).show();
                Intent intente = new Intent(MainActivity.this, RegistroActivity.class);
                startActivity(intente);
                break;
        }
        //noinspection SimplifiableIfStatement
        /*
        if (id == R.id.action_settings) {
            Toast.makeText(getApplicationContext(), "Click en el menu Setting", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.otraactividad){
            Toast.makeText(getApplicationContext(), "Otra Actividad", Toast.LENGTH_SHORT).show();
            Intent intente = new Intent(MainActivity.this, RegistroActivity.class);
            startActivity(intente);
        }*/

        return super.onOptionsItemSelected(item);
    }
}
