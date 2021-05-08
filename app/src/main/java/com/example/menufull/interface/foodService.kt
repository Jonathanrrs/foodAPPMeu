package com.example.menufull.`interface`

import com.example.menufull.modelo.ComidasJSON
import retrofit2.Call
import retrofit2.http.GET

interface foodService {

    @GET("foodapp/api.json")
    fun getFoods(): Call<ComidasJSON>
}