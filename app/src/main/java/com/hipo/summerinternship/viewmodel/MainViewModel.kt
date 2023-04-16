package com.hipo.summerinternship.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hipo.summerinternship.data.company
import com.hipo.summerinternship.model.CompanyModel
import com.hipo.summerinternship.model.MemberModel

class MainViewModel : ViewModel() {

    private val _companyLiveData = MutableLiveData(company)
    val companyLiveData: MutableLiveData<CompanyModel> = _companyLiveData

    fun addNewMember(member: MemberModel) {
        if (_companyLiveData.value?.members?.contains(member) == false) {
            _companyLiveData.value?.members?.add(member)
        }
    }
}
