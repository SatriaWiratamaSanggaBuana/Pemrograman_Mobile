package com.Satria.Recipes.fragment

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.Satria.Recipes.adapter.RecipeAdapter
import com.Satria.Recipes.model.ResepModel
import com.Satria.Recipes.model.Result
import com.Satria.Recipes.retrofit.RecipeClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RecipeViewModel : ViewModel(){

    interface OnAdapterListener {
        fun onClick(item: Result)
    }

    fun getDataFromApi(recyclerView: RecyclerView, listener: OnAdapterListener){
        RecipeClient.INSTANCE.getDataResep()
            .enqueue(object : Callback<ResepModel> {
                override fun onFailure(call: Call<ResepModel>, t: Throwable) {
                    Log.d("ResepViewModel", "onFailure")
                }

                override fun onResponse(call: Call<ResepModel>, response: Response<ResepModel>) {
                    val data = response.body()?.results
                    recyclerView.adapter = RecipeAdapter(data as ArrayList<Result>, object : RecipeAdapter.OnAdapterListener {
                        override fun onClick(item: Result) {
                            listener.onClick(item)
                        }

                    })
                }
            })
    }
}