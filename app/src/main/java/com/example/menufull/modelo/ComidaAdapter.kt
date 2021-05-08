package com.example.menufull.modelo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.menufull.R
import com.squareup.picasso.Picasso

class ComidaAdapter(private val mContext: Context, private val listacomida: MutableList<Food>): ArrayAdapter<Food>(mContext, 0, listacomida) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutComida = LayoutInflater.from(mContext).inflate(R.layout.listaproducto, parent, false)
        val miImage = layoutComida.findViewById<ImageView>(R.id.imageView)
        val txtName = layoutComida.findViewById<TextView>(R.id.txtnombre)
        val txtPrecio = layoutComida.findViewById<TextView>(R.id.txtprecio)
        val miComida = listacomida[position]

        Picasso.get().load(miComida.image).into(miImage)
        txtName.setText(miComida.name)
        txtPrecio.setText("Precio: "+miComida.price.toString())

        return layoutComida
    }
}