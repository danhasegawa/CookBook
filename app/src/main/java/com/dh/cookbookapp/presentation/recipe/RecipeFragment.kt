package com.dh.cookbookapp.presentation.recipe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.dh.cookbookapp.databinding.FragmentFirstBinding
import com.dh.cookbookapp.presentation.recipe.adapter.RecipeAdapter

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class RecipeFragment : Fragment() {

    private val viewModel: RecipesViewModel by viewModels {
        RecipesViewModel.Factory()
    }
    
    private lateinit var binding: FragmentFirstBinding
    private val adapter by lazy { RecipeAdapter() }

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
        setupAdapater()
    }

    fun setupListeners() {
        binding.fabRecipe.setOnClickListener {
            //@TODO show dialog
        }
    }

    fun setupAdapater() {
        binding.rvRecipes.adapter = adapter

    }
}