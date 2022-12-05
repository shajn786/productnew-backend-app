package com.example.productapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
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

     @PostMapping("/edit")
    public String Edit()
     {
         return "product edit";
     }

     @PostMapping("/delete")
    public String Delete()
     {
         return "delete product";
     }

     @GetMapping("/viewall")
    public String Viewall()
     {
         return "viewall product";
     }

}
