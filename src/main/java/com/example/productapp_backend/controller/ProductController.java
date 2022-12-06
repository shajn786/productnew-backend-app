package com.example.productapp_backend.controller;


import com.example.productapp_backend.dao.ProductDao;
import com.example.productapp_backend.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path="/", consumes =  "application/json", produces = "application/json")
     public String Add(@RequestBody Products p)
     {
         System.out.println(p.getBrand());
         dao.save(p);
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

    @CrossOrigin(origins = "*")
     @GetMapping("/viewall")
    public List<Products> Viewall()
     {
         return (List<Products>)dao.findAll();
     }

}
