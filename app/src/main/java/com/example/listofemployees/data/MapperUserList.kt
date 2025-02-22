package com.example.listofemployees.data

import com.example.listofemployees.data.dto.ListUserDto
import com.example.listofemployees.domain.models.Department
import com.example.listofemployees.domain.models.ListUser

class MapperUserList {

    // Преобразование ListUserDto -> ListUser
    fun mapToListUser(dto: ListUserDto): ListUser{
        return ListUser(
            id = dto.id,
            avatarUrl = dto.avatarUrl,
            firstName = dto.firstName,
            lastName = dto.lastName,
            userTag = dto.userTag,
            department = mapDepartment(dto.department),
            position = dto.position,
            birthday = dto.birthday,
            phone = dto.phone
        )
    }

    fun mapDepartment(department: String):Department{
        return when(department.uppercase()){
            "ANDROID" -> Department.ANDROID
            "IOS" -> Department.IOS
            "DESIGN" -> Department.DESIGN
            "MANAGEMENT" -> Department.MANAGEMENT
            "QA" -> Department.QA
            "BACK_OFFICE" -> Department.BACK_OFFICE
            "FRONTEND" -> Department.FRONTEND
            "HR" -> Department.HR
            "PR" -> Department.PR
            "BACKEND" -> Department.BACKEND
            "SUPPORT" -> Department.SUPPORT
            "ANALYTICS" -> Department.ANALYTICS
            else -> throw IllegalArgumentException("Неизвестный департамент: $department")
        }
    }
}