package com.example.menufull.modelo

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Categoria: Serializable {
    @SerializedName("id")
    val id:Int? = 0
    @SerializedName("name")
    val name:String? = null
    @SerializedName("color")
    val color:String? = null
    @SerializedName("image")
    val image:String? = null

}