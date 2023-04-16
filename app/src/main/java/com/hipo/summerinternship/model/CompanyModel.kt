package com.hipo.summerinternship.model

data class CompanyModel(
    val company: String,
    val team: String,
    val members: ArrayList<MemberModel>,
)