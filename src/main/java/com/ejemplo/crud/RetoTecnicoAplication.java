package com.ejemplo.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import java.util.TimeZone;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ejemplo","com.ejemplo.*"})
 public class RetoTecnicoAplication {

        public static void main(String[] args) {
            SpringApplication.run(RetoTecnicoAplication.class, args);
        }

    }

