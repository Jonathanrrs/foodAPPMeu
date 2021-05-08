package com.example.menufull

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.menufull.modelo.Food
import com.squareup.picasso.Picasso

class detallesproducto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detallesproducto)

        val p = intent.getSerializableExtra("prod") as Food

        val nameDetalle = findViewById<TextView>(R.id.txtnombredetalles)
        val priceDetalle = findViewById<TextView>(R.id.txtpreciodetalles)
        val image = findViewById<ImageView>(R.id.imageView2)

        Picasso.get().load(p.image).into(image)
        nameDetalle.setText(p.name)
        priceDetalle.setText("Precio: "+p.price.toString())
    }
}