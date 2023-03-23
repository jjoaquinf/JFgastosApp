package com.autentia.techtest.gastosApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/")
    public String homePage()
    {
        return "HOLA!!!";
    }
    // end::get-aggregate-root[]
}
