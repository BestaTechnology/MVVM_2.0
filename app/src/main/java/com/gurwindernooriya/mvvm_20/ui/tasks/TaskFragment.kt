package com.gurwindernooriya.mvvm_20.ui.tasks

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.gurwindernooriya.mvvm_20.R
import com.gurwindernooriya.mvvm_20.databinding.FragmentTasksBinding

class TaskFragment : Fragment(R.layout.fragment_tasks) ,MenuProvider{

    private val viewmodel:TaskViewModel by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentTasksBinding.bind(view)
        val taskAdapter =TaskAdapter()

        binding.apply {
            recyclerViewTasks.apply {
                adapter=taskAdapter
                setHasFixedSize(true)
                layoutManager =LinearLayoutManager(requireContext())
            }
        }
    }


    override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {


    }

    override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
        TODO("Not yet implemented")
    }


}