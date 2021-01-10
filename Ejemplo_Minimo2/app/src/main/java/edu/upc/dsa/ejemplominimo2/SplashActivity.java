package edu.upc.dsa.ejemplominimo2;

import edu.upc.dsa.ejemplominimo2.Models.*;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class SplashActivity extends AppCompatActivity {
    APIInterface APIInterface;
    EditText Uname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        APIInterface = APIClient.getClient().create(APIInterface.class);
        Uname = (EditText) findViewById(R.id.UserInput);
    }

    public void sendUser(View view){
        String username = Uname.getText().toString();

        if (username.equals(""))
            Toast.makeText(getApplicationContext(), "Put username", Toast.LENGTH_LONG).show();

        else {
            Call<User> userCall = APIInterface.getUserInfo(username);
            userCall.enqueue(new Callback<User>() {

                @Override
                public void onResponse(Call<User> call, Response<User> response) {
                    User userr = response.body();
                    Call<List<User>> followersCall = APIInterface.getFollowers(username);
                    followersCall.enqueue(new Callback<List<User>>() {

                        @Override
                        public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                            userr.setUserFollowers(response.body());
                            UserInstance.getInstance().setUser(userr);

                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                        }

                        @Override
                        public void onFailure(Call<List<User>> call, Throwable t) {
                        }
                    });
                }

                @Override
                public void onFailure(Call<User> call, Throwable t) {
                }
            });
        }
    }
}