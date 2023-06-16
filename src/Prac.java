package ru.neoflex.practice.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Prac01 API", version = "0.03b", description = "" +
        "Java + Spring Boot + Swagger-UI. Созданы необходимые по ТЗ тесты." +
        " Добавлена In-Memory БД (/flush/all)" +
        " Трубиков Георгий 319/1 - 05.06.2023"))
public class Prac01Application {
    public static void main(String[] args) {
        SpringApplication.run(Prac01Application.class, args);
    }
}
