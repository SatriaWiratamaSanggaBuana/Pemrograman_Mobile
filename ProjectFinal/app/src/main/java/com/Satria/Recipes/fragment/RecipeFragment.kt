package com.Satria.Recipes.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.Satria.Recipes.R
import com.Satria.Recipes.fragment.detail.RecipeDetailFragment
import com.Satria.Recipes.model.Result
import com.Satria.Recipes.util.RecipeData
import kotlinx.android.synthetic.main.fragment_resep.*

class RecipeFragment : Fragment() {

    lateinit var recipeViewModel: RecipeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ResepFragment", "onCreate dipanggil")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("ResepFragment", "onCreateView dipanggil")
        recipeViewModel = ViewModelProvider(this).get(RecipeViewModel::class.java)
        return inflater.inflate(R.layout.fragment_resep, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvResep.setHasFixedSize(true)
        rvResep.layoutManager = LinearLayoutManager(context)
        recipeViewModel.getDataFromApi(rvResep, object : RecipeViewModel.OnAdapterListener {
            override fun onClick(item: Result) {
                RecipeData.fill(item)
                activity?.supportFragmentManager
                    ?.beginTransaction()
                    ?.replace(R.id.container, RecipeDetailFragment())
                    ?.addToBackStack(null)
                    ?.commit()
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ResepFragment", "onDestroy dipanggil")
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RecipeFragment()
    }
}