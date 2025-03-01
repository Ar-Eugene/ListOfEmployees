package com.example.listofemployees.data.dto

data class ListUserDto(
    val id: Int,
    val avatarUrl: String,
    val firstName: String,
    val lastName: String,
    val userTag: String,
    val department: String,
    val position: String,
    val birthday: String,
    val phone: String,
)
