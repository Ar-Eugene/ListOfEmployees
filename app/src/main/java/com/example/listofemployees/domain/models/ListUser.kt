package com.example.listofemployees.domain.models

data class ListUser(
    val id: Int,
    val avatarUrl: String,
    val firstName: String,
    val lastName: String,
    val userTag: String,
    val department: Department,
    val position: String,
    val birthday: String,
    val phone: String,
)
