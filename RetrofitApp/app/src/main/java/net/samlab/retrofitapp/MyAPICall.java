package net.samlab.retrofitapp;

import retrofit2.Call;
import retrofit2.http.GET;



public interface MyAPICall {

    //https://my.api.mockaroo.com/     user?key=ed6437c0
    @GET("user?key=ed6437c0")
    Call<DataModel> getData();
}
