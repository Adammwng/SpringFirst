package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


    @RestController

    public class HelloWorld { // nazwa klasy
        // wskazanie pod jakim adresem dostepna jest metoda
        @RequestMapping("/hello")
        // sygnatura metody
        public String hello() {
            // zwracana wartosc przez przeglądarke
            return "Hello World! and something more :)";
        }

    }


