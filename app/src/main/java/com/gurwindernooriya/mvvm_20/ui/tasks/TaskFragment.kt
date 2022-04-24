package com.gurwindernooriya.mvvm_20.ui.tasks

import android.os.Bundle
import android.view.*
import androidx.core.view.MenuProvider
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.gurwindernooriya.mvvm_20.R
import com.gurwindernooriya.mvvm_20.databinding.FragmentTasksBinding
import javax.inject.Inject

class TaskFragment @Inject constructor(private var viewModel: TaskViewModel) : Fragment(R.layout.fragment_tasks) {

    private lateinit var binding :FragmentTasksBinding



//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//
//        binding = FragmentTasksBinding.bind(view)
//        val taskAdapter =TaskAdapter()
//
//        binding.apply {
//            recyclerViewTasks.apply {
//                adapter=taskAdapter
//                setHasFixedSize(true)
//                layoutManager =LinearLayoutManager(requireContext())
//            }
//        }
//
//        viewModel.tasks.observe(viewLifecycleOwner){
//            taskAdapter.submitList(it)
//        }
//    }


//    override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
//
//
//    }
//
//    override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
//        return true
//    }


}