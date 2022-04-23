package com.gurwindernooriya.mvvm_20.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow


@Dao
interface TaskDao {


    @Query("SELECT * FROM task_table")
    fun gettasks():Flow<List<Taskcls>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun inserttask(taskcls: Taskcls)


    @Update
    suspend fun updatetask(taskcls: Taskcls)


    @Delete
    suspend fun deletetask(taskcls: Taskcls)
}