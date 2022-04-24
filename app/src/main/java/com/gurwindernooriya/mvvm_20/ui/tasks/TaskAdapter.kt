package com.gurwindernooriya.mvvm_20.ui.tasks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.gurwindernooriya.mvvm_20.data.Taskcls
import com.gurwindernooriya.mvvm_20.databinding.ItemTaskBinding

/*it is bit different from recycler view as it changes the whole list if item changes*/

class TaskAdapter :ListAdapter<Taskcls,TaskAdapter.ViewHolderr>(DiffCallBack()) {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderr {
        val binding = ItemTaskBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolderr(binding)

    }

    override fun onBindViewHolder(holder: ViewHolderr, position: Int) {

        val currentitem = getItem(position)
        holder.bind(currentitem)
    }

    class ViewHolderr(private  val binding:ItemTaskBinding):RecyclerView.ViewHolder(binding.root){

        fun bind(taskcls: Taskcls){
            binding.apply {
                checkboxCompleted.isChecked=taskcls.completed
                txtViewName.text=taskcls.name
                txtViewName.paint.isStrikeThruText= taskcls.completed
                labelPriority.isVisible= taskcls.important
            }
        }

    }

    class DiffCallBack :DiffUtil.ItemCallback<Taskcls>(){
        override fun areItemsTheSame(oldItem: Taskcls, newItem: Taskcls): Boolean {

            return oldItem.id==newItem.id

        }

        override fun areContentsTheSame(oldItem: Taskcls, newItem: Taskcls): Boolean {
           return oldItem==newItem
        }

    }
}