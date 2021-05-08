package com.example.menufull.modelo

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Food: Serializable {
    @SerializedName("name")
    val name:String? = null
    @SerializedName("price")
    val price:Double? = 0.0
    @SerializedName("categorie")
    val categorie:Int? = 0
    @SerializedName("image")
    val image:String? = null
}