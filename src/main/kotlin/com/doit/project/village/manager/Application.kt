package com.doit.project.village.manager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EntityScan(basePackages = ["com.doit.project"])
@EnableJpaRepositories(basePackages = ["com.doit.project"])
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
