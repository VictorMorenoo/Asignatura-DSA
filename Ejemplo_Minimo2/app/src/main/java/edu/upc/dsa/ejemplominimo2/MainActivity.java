package edu.upc.dsa.ejemplominimo2;

import edu.upc.dsa.ejemplominimo2.Models.*;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MainActivity extends AppCompatActivity
{
    User user;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView fullName = findViewById(R.id.);
        //TextView username = findViewById(R.id.);
        TextView repos = findViewById(R.id.textView);
        TextView following = findViewById(R.id.textView2);
        recyclerView = (RecyclerView) findViewById(R.id.RecyclerView1);

        user = UserInstance.getInstance().getUser();
        Picasso.with(getApplicationContext()).load(user.getAvatar_url()).into((ImageView) findViewById(R.id.imageView));
        //fullName.setText(user.getName());
       // username.setText("Username: " + user.getLogin());
        repos.setText("Repositories: " + String.valueOf(user.getPublic_repos()));
        following.setText("Following: " + String.valueOf(user.getFollowing()));

        // use this setting to
        // improve performance if you know that changes
        // in content do not change the layout size
        // of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        List<User> input = user.getUserFollowers();
        mAdapter = new RecyclerAdapter(input);
        recyclerView.setAdapter(mAdapter);
    }
}
