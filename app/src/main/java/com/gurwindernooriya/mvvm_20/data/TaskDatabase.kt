package com.gurwindernooriya.mvvm_20.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.gurwindernooriya.mvvm_20.di.AppModule
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Provider

@Database(entities = [Taskcls::class],
version = 1)
abstract class TaskDatabase :RoomDatabase(){

    abstract fun taskDao():TaskDao


    /*in this way dagger will not try to initiate databse as this callback is making*/
    class Callback @Inject constructor(private val database:Provider<TaskDatabase>,
     @AppModule.ApplicationScope val applicationscope:CoroutineScope)
        :RoomDatabase.Callback(){



        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)

            val dao =database.get().taskDao()

            applicationscope.launch {
                dao.inserttask(Taskcls("Wash the dishes", completed = true))
                dao.inserttask(Taskcls("Wash the clothes"))
                dao.inserttask(Taskcls("Make the team on Dream11",important = true))
                dao.inserttask(Taskcls("Get married"))
                dao.inserttask(Taskcls("Get married to lovely girl"))
            }

//            db operations, creating dummy data for first time users


        }
    }


}