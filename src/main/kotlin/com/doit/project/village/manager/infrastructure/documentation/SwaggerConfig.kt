package com.doit.project.village.manager.infrastructure.documentation

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class SwaggerConfig {

    @Bean
    fun api(): Docket = Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.any())
        .build()
        .apiInfo(metaData())
        .useDefaultResponseMessages(false)


    private fun metaData(): ApiInfo = ApiInfoBuilder()
        .title("Villager Manager API")
        .description("API for managing condominiums, villages, groups of residences and businesses.")
        .version("0.0.1")
        .contact(
            Contact(
                "Do It - Software House, Consulting and Services",
                "https://github.com/do-it-corp",
                "henrique.santos1988@gmail.com")
        )
        .build()

}