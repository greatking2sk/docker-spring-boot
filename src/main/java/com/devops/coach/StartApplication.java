package com.devops.coach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Howdy Folks..Welcome to Devops Coaching by Coach Big 7!");
        model.addAttribute("msg", "Hello Mates..I am deploying springboot application into EKS cluster using Helm + Jenkins Pipeline!!!! Today is September 11, 2023 (9/11 Anniversary");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
