package br.com.darisson.noticias.service;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseNoticiaService {

    private final String BASE_URL = "https://www4.unifor.br/ws/";

    protected API getNoticiaAPI() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(API.class);
    }
}
