package com.asimbalbay.retrofitjava;

import com.asimbalbay.retrofitjava.model.CryptoModel;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {


    //GET, POST, UPDATE; DELETE

    //URL BASE -> www.website.com
    //GET -> price?key=xxx

    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json

    @GET("www.website.com/price?=key")
    Observable<List<CryptoModel>> getData();


    //Call<List<CryptoModel>> getData();



}
