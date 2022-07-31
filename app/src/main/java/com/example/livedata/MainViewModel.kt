package com.example.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val nameLiveDataObject = MutableLiveData<String>("Pavan")

    val nameLiveData: LiveData<String>
    get() = nameLiveDataObject

    fun updateName(){
        nameLiveDataObject.value = "PA-1"
    }
}