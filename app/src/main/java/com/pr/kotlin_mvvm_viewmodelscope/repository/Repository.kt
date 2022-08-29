package com.pr.kotlin_mvvm_viewmodelscope.repository

import com.pr.kotlin_mvvm_viewmodelscope.model.Car
import kotlinx.coroutines.delay

class Repository {




    suspend fun getData():Car{
        delay(1000)
        return Car("TESLA","777")
    }

}