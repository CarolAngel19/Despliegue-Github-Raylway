package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/nombre")
    public String getNombre() {
        return "Soy Carol Vanessa Angel Franco";
    }
}
