package com.example.navigationuidemo2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class TenantViewModel {

    private val _tenantInfo = MutableLiveData<String>("")
    val tenantInfo: LiveData<String> = _tenantInfo
    val capitalizedTenantInfo: LiveData<String> =

        Transformations.map(_tenantInfo) {
            it.uppercase()
        }

//    fun addTenant(name: String, unit: String, rent: String) {
//
//        val newEntry = "Name: $name\nUnit: $unit\nRent: $rent\n\n"
//        _tenantInfo.value += newEntry
//    }

    private val _tenantCount = MutableLiveData<Int>(0)
    val tenantCount: LiveData<Int> = _tenantCount

    fun addTenant(name: String, unit: String, rent: String) {

        val newEntry = "Name: $name\nUnit: $unit\nRent: $rent\n\n"
        _tenantInfo.value += newEntry
        _tenantCount.value = (_tenantCount.value ?: 0) + 1
    }
}