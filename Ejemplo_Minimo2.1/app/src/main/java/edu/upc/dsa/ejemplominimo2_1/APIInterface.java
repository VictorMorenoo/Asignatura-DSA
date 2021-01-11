package edu.upc.dsa.ejemplominimo2_1;
import edu.upc.dsa.ejemplominimo2_1.models.*;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIInterface
{
    @GET("api/dataset/museus/format/json/pag-ini/1/pag-fi/15")     //GET the list of Museums
    Call<Museums> getMuseums();
}
