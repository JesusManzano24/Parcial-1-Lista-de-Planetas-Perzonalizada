package com.jesusmanzano.parcial1listadeplanetas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;



public class MainActivity2 extends AppCompatActivity {
    private ListView listView;
    private TextView nombreUsuarioTextView;
    public static final String Datos = "MyPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = findViewById(R.id.List);
        nombreUsuarioTextView = findViewById(R.id.nombreusuario);

        String[] nombres = {"Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno", "Urano", "Neptuno"};
        Integer[] idimage = {R.drawable.mercurio, R.drawable.venus, R.drawable.tierra, R.drawable.marte, R.drawable.jupiter, R.drawable.saturno, R.drawable.urano, R.drawable.neptuno};
        String[] descripciones = {
                "Mercurio: El planeta más cálido del sistema solar",
                "Venus: el planeta del Amor",
                "La Tierra: Nuestro Hogar",
                "Marte: ¿No era un día de la semana?",
                "Jupiter: El planeta gaseoso",
                "Saturno: el planeta con anillos",
                "Urano: el único planeta que rota de lado",
                "Neptuno: el planeta más lejano del sol"
        };

        AdapterList adapter = new AdapterList(this, nombres, idimage, descripciones);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("POSICION_PLANETA", position); // Pasamos la posición del planeta seleccionado
                startActivity(intent);
            }
        });

        // Recuperamos el nombre del usuario de SharedPreferences
        SharedPreferences prefs = getSharedPreferences(MainActivity.Datos, MODE_PRIVATE);
        String user = prefs.getString("username", "Usuario no definido");
        nombreUsuarioTextView.setText(user);
    }
}


