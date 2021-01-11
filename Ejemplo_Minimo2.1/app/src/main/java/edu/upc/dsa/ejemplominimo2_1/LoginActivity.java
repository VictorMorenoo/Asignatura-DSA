package edu.upc.dsa.ejemplominimo2_1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity
{
    public EditText Username, Password;
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Username = (EditText) findViewById(R.id.txtUsername);
        Password = (EditText) findViewById(R.id.txtPasword);
        sharedPref = getApplicationContext().getSharedPreferences("EjemploMin2", Context.MODE_PRIVATE);
        editor = sharedPref.edit();
    }

    public void LoginClick(View v)
    {
        String username = Username.getText().toString();
        String password = Password.getText().toString();

        if (username.equals("user") && password.equals("dsamola")) {
            editor.putBoolean("login", true);
            editor.commit();
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }
        else {
            Toast.makeText(getApplicationContext(), "Usuario y/o contraseña incorrecto", Toast.LENGTH_LONG).show();
        }
    }
}
