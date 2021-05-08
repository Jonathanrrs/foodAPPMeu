package com.example.menufull.ui.pizzas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.menufull.R

class PizzaFragment : Fragment() {

    //private lateinit var slideshowViewModel: SlideshowViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        //slideshowViewModel =
                //ViewModelProvider(this).get(SlideshowViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_pizza, container, false)
        //val textView: TextView = root.findViewById(R.id.text_slideshow)
        //slideshowViewModel.text.observe(viewLifecycleOwner, Observer {
          //  textView.text = it
        //})
        return root
    }
}