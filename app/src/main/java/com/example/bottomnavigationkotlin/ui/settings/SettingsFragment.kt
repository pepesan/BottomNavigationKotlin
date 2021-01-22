package com.example.bottomnavigationkotlin.ui.settings

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.bottomnavigationkotlin.MainActivity
import com.example.bottomnavigationkotlin.R

class SettingsFragment : Fragment() {


    private lateinit var viewModel: SettingsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(SettingsViewModel::class.java)
        (activity as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(false);
        val root = inflater.inflate(R.layout.settings_fragment, container, false)
        // TODO: Use the ViewModel

        root.findViewById<Button>(R.id.settings_button).setOnClickListener {
            Navigation.findNavController(it).navigate(
                R.id.action_navigation_settings_to_subSettingsFragment
            )
        }
        return root
    }
}