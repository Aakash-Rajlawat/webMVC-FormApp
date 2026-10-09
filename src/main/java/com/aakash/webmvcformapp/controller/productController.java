package com.aakash.webmvcformapp.controller;

import com.aakash.webmvcformapp.Dao.productDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class productController {

    @GetMapping("/")
    private String getProduct(Model model) {
        productDao productDao = new productDao();
        model.addAttribute("productDao", productDao);
        return "Product";
    }

    @PostMapping("/product/save")
    private String saveProduct(productDao product , Model model) {
        System.out.println(product);

        model.addAttribute("success", "Product saved successfully");
        return "success";

    }
}