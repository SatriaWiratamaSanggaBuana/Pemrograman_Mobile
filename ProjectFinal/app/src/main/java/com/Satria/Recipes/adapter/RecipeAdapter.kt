package com.Satria.Recipes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.Satria.Recipes.R
import com.Satria.Recipes.model.Result
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.resep_adapter.view.*

class RecipeAdapter(
    private val listResep: ArrayList<Result>,
    val listener: OnAdapterListener
) :
    RecyclerView.Adapter<RecipeAdapter.Resepholder>() {

    interface OnAdapterListener {
        fun onClick(item: Result)
    }

    class Resepholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Result, listener: OnAdapterListener) {
            with(itemView) {
                tvJudul.text = item.title
                Picasso.get()
                    .load(item.thumb)
                    .into(imgResep)
                itemView.setOnClickListener {
//
                    listener.onClick(item)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Resepholder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.resep_adapter, parent, false)
        return Resepholder(view)
    }

    override fun getItemCount(): Int {
        return listResep.size
    }

    override fun onBindViewHolder(holder: Resepholder, position: Int) {
        holder.bind(listResep[position], listener)
    }

}