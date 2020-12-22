package com.example.appserba.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appserba.R
import com.example.appserba.data.repository.AuthRepository
import com.example.appserba.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {
    val viewModel: AuthViewModel by lazy { AuthViewModel(AuthRepository()) }
    lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        return binding.root
    }

}