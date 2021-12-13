package com.Satria.Recipes.util

import com.Satria.Recipes.model.Result

class RecipeData {

    companion object{
        var dificulty: String = ""
        var key: String = ""
        var portion: String = ""
        var thumb: String = ""
        var times: String = ""
        var title: String = ""

        fun fill(item: Result){
            dificulty = item.dificulty
            key = item.key
            portion = item.portion
            thumb = item.thumb
            times = item.times
            title = item.title
        }
    }
}