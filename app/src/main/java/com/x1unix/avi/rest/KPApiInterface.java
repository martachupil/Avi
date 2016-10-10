package com.x1unix.avi.rest;

import com.x1unix.avi.model.KPMovieSearchResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface KPApiInterface {
    @GET("searchFilms")
    Call<KPMovieSearchResult> findMovies(@Query("keyword") String keyword);

}