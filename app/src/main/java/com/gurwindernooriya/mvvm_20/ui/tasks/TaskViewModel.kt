package com.gurwindernooriya.mvvm_20.ui.tasks

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.gurwindernooriya.mvvm_20.data.TaskDao
import javax.inject.Inject

class TaskViewModel @Inject constructor(private val taskDao: TaskDao):ViewModel() {

     val tasks = taskDao.gettasks().asLiveData()

}