package com.example.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val nameLiveData = MutableLiveData<String>("Pavan")

    fun updateName(){
        nameLiveData.value = "PA-1"
    }
}