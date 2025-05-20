package com.rds.productservice.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerUIController {

    @GetMapping
    public String getSwaggerUI() {
        return "redirect:/swagger-ui/index.html";
    }

}
