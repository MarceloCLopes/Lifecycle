package com.mcl.lifecycle.domain

import androidx.lifecycle.LiveData

interface CounterRepository {
    fun getCounter(): LiveData<Int>

    fun incrementCounterBy(increment: Int)
}