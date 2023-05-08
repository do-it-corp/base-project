package com.doit.project.village.manager.domain.entities

import com.doit.project.village.manager.models.dtos.UserCreateDTO
import java.util.*
import javax.persistence.*


@Entity
@Table(name = "user")
data class User(
    @Id
    @GeneratedValue
    val id: UUID? = null,

    @Column
    val name: String,

    @Column
    val email: String,

    @Column
    val password: String,

    ) {

    constructor(dto: UserCreateDTO): this(
        name = dto.name,
        email = dto.email,
        password = dto.password
    )
}