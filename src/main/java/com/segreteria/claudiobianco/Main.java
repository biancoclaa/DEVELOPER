package com.segreteria.claudiobianco;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        System.out.println("App Starting...");
        SpringApplication.run(Main.class, args);

    }

    @Bean
    public ObjectMapper getObjectMapper(){
        return new ObjectMapper();
    }
}