package com.pr.kotlin_mvvm_viewmodelscope.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pr.kotlin_mvvm_viewmodelscope.model.Car
import com.pr.kotlin_mvvm_viewmodelscope.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {

    val repository=Repository()
    var livedatacar=MutableLiveData<Car>()

    fun getAllData(){
        viewModelScope.launch{
            livedatacar.value=repository.getData()
        }
    }
}