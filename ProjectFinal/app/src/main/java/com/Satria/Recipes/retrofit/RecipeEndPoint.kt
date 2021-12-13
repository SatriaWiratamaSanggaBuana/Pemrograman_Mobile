package com.Satria.Recipes.retrofit

import com.Satria.Recipes.model.ResepModel
import retrofit2.Call
import retrofit2.http.GET

interface RecipeEndPoint {

    @GET("api/recipes")
    fun getDataResep(): Call<ResepModel>

}