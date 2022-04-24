package com.gurwindernooriya.mvvm_20.di

import android.app.Application
import androidx.room.Room
import com.gurwindernooriya.mvvm_20.data.TaskDao
import com.gurwindernooriya.mvvm_20.data.TaskDatabase
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/*here we will tell dagger what class to be injected*/
@Module
object AppModule {


    @Provides
    @Singleton
    fun provideDatabase(application: Application)= Room.databaseBuilder(application,TaskDatabase::class.java,
        "task_database").fallbackToDestructiveMigration()
        .build()

    @Provides
    fun provideTaskdao(db:TaskDatabase)=db.taskDao()



}