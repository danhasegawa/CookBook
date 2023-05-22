package com.dh.cookbookapp.presentation.recipe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dh.cookbookapp.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class RecipeFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private val adapter by lazy { }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    fun setupListeners() {
        binding.fabRecipe.setOnClickListener {
            //@TODO show dialog
        }
    }

    fun setupAdapater() {
        //@TODO criar vinculacao do adapter

    }
}