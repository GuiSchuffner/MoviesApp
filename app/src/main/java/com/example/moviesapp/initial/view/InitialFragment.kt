package com.example.lolproject.initial.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import com.example.lolproject.initial.presentation.InitialFragmentViewModel
import com.example.moviesapp.databinding.InitialFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class InitialFragment : Fragment() {
    private var _binding: InitialFragmentBinding? = null
    private val binding: InitialFragmentBinding get() = _binding!!
    private val initialFragmentViewModel: InitialFragmentViewModel
        by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = InitialFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.insertTitleName.addTextChangedListener {
            initialFragmentViewModel.setMovies(it.toString())
        }
        binding.searchButton.setOnClickListener {
            initialFragmentViewModel.onSearchButtonClicked()
        }
    }
}