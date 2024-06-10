package com.jesusmanzano.parcial1listadeplanetas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    class PlanetaInfo {
        String nombre;
        int imagen;
        String descripcion;
        String descripcion2;
        String descripcion3;
        String descripcion4;
        int imagen2;
        int imagen3;
        int imagen4;

        PlanetaInfo(String nombre, int imagenId, String descripcion, String descripcion2,String descripcion3, String descripcion4, int imagen2Id, int imagen3Id, int imagen4Id) {
            this.nombre = nombre;
            this.imagen = imagenId;
            this.descripcion = descripcion;
            this.descripcion2 = descripcion2;
            this.descripcion3 = descripcion3;
            this.descripcion4 = descripcion4;
            this.imagen2 = imagen2Id;
            this.imagen3 = imagen3Id;
            this.imagen4 = imagen4Id;
        }
    }

    PlanetaInfo[] planetas = {
            new PlanetaInfo(
                    "Mercurio",
                    R.drawable.mercurio,
                    "Mercurio es el planeta más pequeño de nuestro sistema solar",
                    "Conocido por sus extremas fluctuaciones de temperatura, Mercurio puede alcanzar los 430°C durante el día y descender a -180°C por la noche.",
                    "A pesar de estar más cerca del Sol, Mercurio no es el planeta más caliente, ese título lo tiene Venus debido a su densa atmósfera.",
                    "Mercurio: Es el planeta más cercano al Sol y debido a su proximidad, no fue hasta 1631 cuando los humanos pudieron observar por primera vez su tránsito frente al Sol, un evento predicho por Johannes Kepler.",
                    R.drawable.mercurio2, R.drawable.mercurio3, R.drawable.mercurio4
            ),
            new PlanetaInfo(
                    "Venus",
                    R.drawable.venus,
                    "El segundo planeta del sistema solar.",
                    "Venus gira en dirección opuesta a la mayoría de los planetas y tiene una rotación muy lenta, con un día que dura más que su año.",
                    "Venus es el planeta más brillante en nuestro cielo nocturno y a veces se le llama 'la estrella del alba' o 'la estrella vespertina'.",
                    "Venus: A menudo llamado la 'estrella de la mañana' o la 'estrella de la tarde', Venus tiene la rotación más lenta de todos los planetas y gira en dirección opuesta a la mayoría de los planetas.",
                    R.drawable.venus2, R.drawable.venus3, R.drawable.venus4
            ),
            new PlanetaInfo(
                    "Tierra",
                    R.drawable.tierra,
                    "Nuestro planeta.",
                    "La Tierra es el único planeta conocido que alberga vida, con una biodiversidad que va desde los microorganismos hasta las formas de vida más complejas.",
                    "La Tierra tiene un poderoso campo magnético que nos protege de los peligrosos vientos solares y las radiaciones cósmicas.",
                    "Tierra: Nuestro propio planeta es el único lugar conocido con vida. La Tierra ha tenido cinco extinciones masivas, siendo la más famosa la que acabó con los dinosaurios hace aproximadamente 65 millones de años.",
                    R.drawable.tierra2, R.drawable.tierra3, R.drawable.tierra4
            ),
            new PlanetaInfo(
                    "Marte",
                    R.drawable.marte,
                    "El planeta rojo más cercano al Sol.",
                    "Marte alberga el volcán más alto del sistema solar, el Monte Olimpo, y tiene signos de antiguos cauces de ríos, lo que sugiere la presencia de agua en el pasado.",
                    "Marte es el hogar de las mayores tormentas de polvo del sistema solar, algunas de las cuales pueden cubrir todo el planeta.",
                    "Marte: Conocido como el planeta rojo por su apariencia, Marte ha sido objeto de estudio por su posible habitabilidad. El Viking 1 fue la primera misión en aterrizar con éxito en Marte en 1976.",
                    R.drawable.marte2, R.drawable.marte3, R.drawable.marte4
            ),
            new PlanetaInfo(
                    "Júpiter",
                    R.drawable.jupiter,
                    "El planeta más grande del sistema solar.",
                    "Júpiter es un gigante gaseoso con una Gran Mancha Roja, una tormenta más grande que la Tierra que ha estado activa durante siglos.",
                    "Júpiter actúa como un escudo gigante para la Tierra, atrayendo muchos asteroides y cometas que podrían impactar nuestro planeta.",
                    "Júpiter: Es el gigante gaseoso más grande de nuestro sistema solar y se cree que su Gran Mancha Roja, una tormenta gigante, ha estado activa desde al menos 1665, observada por primera vez por Giovanni Cassini.",
                    R.drawable.jupiter2, R.drawable.jupiter3, R.drawable.jupiter4
            ),
            new PlanetaInfo(
                    "Saturno",
                    R.drawable.saturno,
                    "El planeta que Tiene anillos.",
                    "Saturno es famoso por su impresionante sistema de anillos compuesto por hielo y rocas, y tiene más de 80 lunas conocidas.",
                    "Los anillos de Saturno son tan grandes que si estuvieran alrededor de la Tierra, veríamos los anillos en el cielo más grandes que la Luna.",
                    "Saturno: Famoso por sus anillos, Saturno fue observado por Galileo en 1610, pero no pudo discernir su estructura anular. Fue Christiaan Huygens quien más tarde, en 1655, describió correctamente los anillos de Saturno.",
                    R.drawable.saturno2, R.drawable.saturno3, R.drawable.saturno4
            ),
            new PlanetaInfo(
                    "Urano",
                    R.drawable.urano,
                    "El planeta con el agua más grande del sistema solar.",
                    "Urano tiene una inclinación axial única que hace que gire de lado, con sus polos apuntando hacia el Sol durante parte de su órbita.",
                    "Urano es uno de los dos únicos planetas que giran de lado en el sistema solar, y su nombre a menudo se pronuncia incorrectamente.",
                    "Urano: Descubierto por William Herschel en 1781, Urano fue el primer planeta descubierto con un telescopio y es único por su rotación lateral, casi como si rodara en su órbita.",
                    R.drawable.urano2, R.drawable.urano3, R.drawable.urano4
            ),
            new PlanetaInfo(
                    "Neptuno",
                    R.drawable.neptuno,
                    "El planeta más lejano al sol.",
                    "Neptuno es conocido por sus fuertes vientos y fue el primer planeta cuya existencia fue predicha matemáticamente antes de ser observado directamente.",
                    "Neptuno tiene la velocidad de viento más rápida del sistema solar, con ráfagas que superan los 2,100 kilómetros por hora.",
                    "Neptuno: El único planeta del sistema solar que no puede ser visto a simple vista. Fue descubierto en 1846 gracias a predicciones matemáticas basadas en perturbaciones en la órbita de Urano.",
                    R.drawable.neptuno2, R.drawable.neptuno3, R.drawable.neptuno4
            )

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Recuperar la posición del planeta seleccionado
        int posicionSeleccionada = getIntent().getIntExtra("POSICION_PLANETA", 0);
        actualizarInformacionDelPlaneta(posicionSeleccionada);

        ImageButton botonIrAOtraPagina = (ImageButton) findViewById(R.id.botonAtras);
        botonIrAOtraPagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    public void actualizarInformacionDelPlaneta(int posicionSeleccionada) {
        PlanetaInfo planetaSeleccionado = planetas[posicionSeleccionada];

        TextView nombrePlanetaTextView = findViewById(R.id.nombrePlaneta);
        ImageView imagenPlanetaImageView = findViewById(R.id.image);
        TextView descripcionPlanetaTextView = findViewById(R.id.Descripcion);
        TextView descripcion2PlanetaTextView = findViewById(R.id.Descripcion2);
        TextView descripcion3PlanetaTextView = findViewById(R.id.Descripcion3);
        TextView descripcion4PlanetaTextView = findViewById(R.id.Descripcion4);
        ImageView imagen2PlanetaImageView = findViewById(R.id.image2);
        ImageView imagen3PlanetaImageView = findViewById(R.id.image3);
        ImageView imagen4PlanetaImageView = findViewById(R.id.image4);


        nombrePlanetaTextView.setText(planetaSeleccionado.nombre);
        imagenPlanetaImageView.setImageResource(planetaSeleccionado.imagen);
        descripcionPlanetaTextView.setText(planetaSeleccionado.descripcion);
        descripcion2PlanetaTextView.setText(planetaSeleccionado.descripcion2);
        descripcion3PlanetaTextView.setText(planetaSeleccionado.descripcion3);
        descripcion4PlanetaTextView.setText(planetaSeleccionado.descripcion4);
        imagen2PlanetaImageView.setImageResource(planetaSeleccionado.imagen2);
        imagen3PlanetaImageView.setImageResource(planetaSeleccionado.imagen3);
        imagen4PlanetaImageView.setImageResource(planetaSeleccionado.imagen4);

    }
}
