package com.doit.project.village.manager.domain.repositories

import com.doit.project.village.manager.domain.entities.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository: JpaRepository<User, UUID>