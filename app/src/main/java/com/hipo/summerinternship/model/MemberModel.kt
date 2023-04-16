package com.hipo.summerinternship.model

data class MemberModel(
    val name: String,
    val age: Int,
    val location: String,
    val github: String,
    val hipo: HipoModel,
)