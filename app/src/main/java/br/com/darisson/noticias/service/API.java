package br.com.darisson.noticias.service;

import br.com.darisson.noticias.model.Data;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface API {

    @GET("noticias/ultimas/{tipoNoticia}")
    Call<Data> getNoticiaTipo(@Path("tipoNoticia") String tipoNoticia, @Query("regIni") int regIni, @Query("regFim") int regFim);

}
