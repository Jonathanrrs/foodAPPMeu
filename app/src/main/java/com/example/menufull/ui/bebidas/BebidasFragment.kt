package com.example.menufull.ui.bebidas

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.example.menufull.R
import com.example.menufull.`interface`.foodService
import com.example.menufull.detallesproducto
import com.example.menufull.modelo.ComidaAdapter
import com.example.menufull.modelo.ComidasJSON
import com.example.menufull.modelo.Food
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class BebidasFragment : Fragment() {

    //private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //galleryViewModel =
        //ViewModelProvider(this).get(GalleryViewModel::class.java)
        val appContext= requireContext().applicationContext
        val root = inflater.inflate(R.layout.fragment_bebidas, container, false)
        //val textView: TextView = root.findViewById(R.id.text_gallery)
        //galleryViewModel.text.observe(viewLifecycleOwner, Observer {
        //textView.text = it
        //})

        val retrofit = Retrofit.Builder()
            .baseUrl("https://tutofox.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(foodService::class.java)
        val call = service.getFoods()

        val listaMostrar = mutableListOf<Food>()
        call.enqueue(object : Callback<ComidasJSON> {
            override fun onResponse(call: Call<ComidasJSON>?, response: Response<ComidasJSON>?) {
                val foods = response?.body()

                if(foods!=null) {
                    for (food in foods.food) {
                        if(food.categorie == 4) {
                            listaMostrar.add(food)
                        }
                    }
                }

                val miComidaAdapter = ComidaAdapter(appContext, listaMostrar)
                val milista = root.findViewById<ListView>(R.id.milistview4)
                milista.adapter = miComidaAdapter

                milista.setOnItemClickListener { parent, view, position, id ->
                    val miintent = Intent(appContext, detallesproducto::class.java)
                    miintent.putExtra("prod", listaMostrar[position])
                    startActivity(miintent)

                }
            }

            override fun onFailure(call: Call<ComidasJSON>?, t: Throwable?) {
                TODO("Not yet implemented")
            }
        })

        return root
    }
}