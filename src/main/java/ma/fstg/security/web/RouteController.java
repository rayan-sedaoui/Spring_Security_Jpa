package ma.fstg.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RouteController {

    @GetMapping("/login")
    public String login() {
        return "login"; // Va chercher src/main/resources/templates/login.html
    }

    @GetMapping("/home")
    public String home() {
        return "home"; // Va chercher src/main/resources/templates/home.html
    }
}