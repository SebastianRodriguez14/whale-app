package com.sebastianrod.whale_app;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("animals")
    Call<ArrayList<WhaleModel>> getWhales();

}
