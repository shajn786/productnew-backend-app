package com.example.productapp_backend.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @PostMapping("/")
     public String Add()
     {
         return "add page";
     }

     @PostMapping("/search")
     public String Search()
     {
         return "search page";
     }



}
