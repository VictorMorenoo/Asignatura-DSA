package edu.upc.dsa.ejemplominimo2_1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import edu.upc.dsa.ejemplominimo2_1.models.*;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class MuseumDetail extends AppCompatActivity
{
    private Element museum;

    private TextView txtNombre;
    private TextView txtDescripcion;
    private TextView txtdireccion;
    private TextView txtcp;
    private TextView txtmunicipio;
    private TextView txtemail;
    private TextView txttelefono;
    private TextView txthabitantes;
    private TextView txtextension;
    private TextView txtaltitud;

    private ImageView imageescudo;
    private ImageView imagebandera;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_detail);
        Intent intent = getIntent();

        String nombre = intent.getStringExtra("nombre");
        String descripcion = intent.getStringExtra("descripcion");
        String direccionGrupo = intent.getStringExtra("direccionGrupo");
        String postalGrupo = intent.getStringExtra("postalGrupo");
        String municipio = intent.getStringExtra("municipio");
        String email = intent.getStringExtra("email");
        String telefono = intent.getStringExtra("telefono");
        String urlEscudo = intent.getStringExtra("urlEscudo");
        String urlBandera = intent.getStringExtra("urlBandera");
        String urlMuseo = intent.getStringExtra("urlMuseo");
        String numeroHab = intent.getStringExtra("numeroHabitantes");
        String extension = intent.getStringExtra("extension");
        String altitud = intent.getStringExtra("altitud");

        txtNombre = findViewById(R.id.textNombre);
        txtDescripcion = findViewById(R.id.textDescripcion);
        txtdireccion = findViewById(R.id.textDireccion);
        txtcp = findViewById(R.id.textCP);
        txtmunicipio = findViewById(R.id.textMunicipio);
        txtemail = findViewById(R.id.textEmail);
        txttelefono = findViewById(R.id.textTelefono);
        txthabitantes = findViewById(R.id.textNumHabs);
        txtextension = findViewById(R.id.textExtesion);
        txtaltitud = findViewById(R.id.textAltitud);
        imagebandera = findViewById(R.id.imageBandera);
        imageescudo = findViewById(R.id.imageEscudo);

        txtNombre.setText(nombre);
        txtDescripcion.setText(descripcion);
        txtdireccion.setText("Direccion: " + direccionGrupo);
        txtcp.setText("CP: " + postalGrupo);
        txtmunicipio.setText("Municipio: " + municipio);
        txtemail.setText("Email: " + email);
        txttelefono.setText("Teléfono: " + telefono);
        txthabitantes.setText("Habitantes: " + numeroHab);
        txtextension.setText("Extensión: " + extension);
        txtaltitud.setText("Altitud: " + altitud);
        Picasso.with(getApplicationContext()).load(urlMuseo).into(imagebandera);
        Picasso.with(getApplicationContext()).load(urlEscudo).into(imageescudo);
    }
}
