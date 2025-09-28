package cz.itnetwork.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelooWorldController {

    @GetMapping("/")
    public @ResponseBody String helloWorld() {
        return "Hello, World";
    }
}
