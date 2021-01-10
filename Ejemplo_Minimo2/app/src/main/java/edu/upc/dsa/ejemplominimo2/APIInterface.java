package edu.upc.dsa.ejemplominimo2;

import edu.upc.dsa.ejemplominimo2.Models.*;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIInterface
{
    @GET("{user}")
    Call<User> getUserInfo(@Path("user") String user);

    @GET ("{user}/followers")
    Call<List<User>> getFollowers(@Path("user") String user);
}
