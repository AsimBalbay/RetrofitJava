package com.asimbalbay.retrofitjava;

import com.asimbalbay.retrofitjava.model.CryptoModel;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    @GET("currencies/ticker?key=d1dd62e634ab1b2449fb22c3ce0832b220c716c0")
    Observable<List<CryptoModel>> getData();

}
