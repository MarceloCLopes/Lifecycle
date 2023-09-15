package com.mcl.lifecycle.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.mcl.lifecycle.data.CounterRepositoryImpl
import com.mcl.lifecycle.presentation.counter.MainViewModel

class ViewModelFactory : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        if (modelClass == MainViewModel::class.java){
            return MainViewModel(repository = CounterRepositoryImpl()) as T
        }
        throw IllegalArgumentException("Unknown ViewModel instance for $modelClass")
    }
}