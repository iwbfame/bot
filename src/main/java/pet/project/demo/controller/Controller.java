package pet.project.demo.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/telegram/bot")
public class Controller {
    @PostMapping("/update")
    public String profile(@RequestBody String update) {
        return "";
    }
}
