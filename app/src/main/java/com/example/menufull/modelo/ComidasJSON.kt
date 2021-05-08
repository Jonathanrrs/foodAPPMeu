package com.example.menufull.modelo

import com.google.gson.annotations.SerializedName

class ComidasJSON {
    @SerializedName("banner")
    val banner = arrayOf<String>()
    @SerializedName("categories")
    val categories = arrayOf<Categoria>()
    @SerializedName("food")
    val food = arrayOf<Food>()
}