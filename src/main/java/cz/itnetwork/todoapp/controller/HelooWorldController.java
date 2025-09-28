package cz.itnetwork.todoapp.controller;
import org.springframework.stereotype. Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation. GetMapping;

@Controller
class HelloWorldController {
    @GetMapping("/")
    public String helloWorld(Model model) {
// predávame do šablóny "premennú" name s hodnotou "ITnetwork"
        model.addAttribute("name", "ITnetwork");
        return "helloworld";
    }
}