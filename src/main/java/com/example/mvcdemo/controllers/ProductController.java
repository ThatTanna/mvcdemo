package com.example.mvcdemo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.mvcdemo.models.Category;
import com.example.mvcdemo.models.Product;

@Controller
public class ProductController {
    
    @GetMapping("/getProductForm")
    // "prod" -> name given to the Product product created from (models) Product.java
    public String getProductForm(@ModelAttribute("prod") Product product, Model model){
        // model.addAttribute("categoryList", Arrays.asList(
        //     new Category(1, "Computer"),
        //     new Category(2, "Laptop")
        // ));
        // @ModelAttribute("prod") Product product =
        // model.addAttribute("prod", new Product());
        System.out.println("Inside getProductForm()....");
        System.out.println(model.asMap().get("categoryList"));
        return "productForm";
    }

    @GetMapping("/a")
    public String getA(Model model){
        System.out.println("Inside getA()....");
        System.out.println(model.asMap().get("categoryList"));
        return "productForm";
    }

    @GetMapping("/b")
    public String getB(Model model){
        System.out.println("Inside getB()....");
        System.out.println(model.asMap().get("categoryList"));
        return "productForm";
    }

    // Will only be used inside this controller
    @ModelAttribute("categoryList")
    public List<Category> getCategoryList(){

        return Arrays.asList(
            new Category(1, "Computer"),
            new Category(2, "Laptop")
        );

    }
}
