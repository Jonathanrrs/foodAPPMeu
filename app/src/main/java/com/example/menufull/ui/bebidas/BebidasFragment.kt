package com.example.menufull.ui.bebidas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.menufull.R

class BebidasFragment : Fragment() {

    //private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //galleryViewModel =
        //ViewModelProvider(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_bebidas, container, false)
        //val textView: TextView = root.findViewById(R.id.text_gallery)
        //galleryViewModel.text.observe(viewLifecycleOwner, Observer {
        //textView.text = it
        //})
        return root
    }
}