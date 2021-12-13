package com.Satria.Recipes.fragment.detail

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.Satria.Recipes.R
import com.Satria.Recipes.util.RecipeData
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_resep_detail.*

class RecipeDetailFragment : Fragment() {
    // TODO: Rename and change types of parameters
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resep_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Picasso.get()
            .load(RecipeData.thumb)
            .into(imgResepDetail)
        tvResepJudul.text = RecipeData.title
        tvWaktu.text = RecipeData.times
        tvPorsi.text = RecipeData.portion
        tvKesulitan.text = RecipeData.dificulty

        btnShare.setOnClickListener{
            val intent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, " _${RecipeData.title}_ memiliki tingkat kesulitan yang *${RecipeData.dificulty}* dan menghasilkan *${RecipeData.portion}* makanan yang membutuhkan waktu masak selama *${RecipeData.times}* ")
                type = "text/plain"
            }
            val i = Intent.createChooser(intent, null)
            startActivity(i)
        }
    }

    companion object {
        fun newInstance(param1: String, param2: String) =
            RecipeDetailFragment()
    }
}