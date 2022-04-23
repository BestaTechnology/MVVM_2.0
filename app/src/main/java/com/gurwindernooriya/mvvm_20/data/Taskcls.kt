package com.gurwindernooriya.mvvm_20.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.text.DateFormat


@Entity(tableName = "task_table")
data class Taskcls(val name:String,
val important:Boolean=false,
val completed:Boolean=false,
val created:Long=System.currentTimeMillis(),
@PrimaryKey(autoGenerate = true)
val id:Int=0)
    :Serializable
{

    val createddateFormat:String
    get() =DateFormat.getDateInstance().format(created)
}