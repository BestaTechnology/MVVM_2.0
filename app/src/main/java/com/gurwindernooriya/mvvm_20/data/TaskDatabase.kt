package com.gurwindernooriya.mvvm_20.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Taskcls::class],
version = 1)
abstract class TaskDatabase :RoomDatabase(){

    abstract fun taskDao():TaskDao


}