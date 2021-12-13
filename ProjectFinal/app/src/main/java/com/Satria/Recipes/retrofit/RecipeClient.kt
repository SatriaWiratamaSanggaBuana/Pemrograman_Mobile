package com.Satria.Recipes.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RecipeClient {
    val base_url = "https://masak-apa.tomorisakura.vercel.app/"

    val INSTANCE : RecipeEndPoint by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(base_url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(RecipeEndPoint::class.java)
    }
}