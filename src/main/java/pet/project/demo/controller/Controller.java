package pet.project.demo.controller;

import org.springframework.web.bind.annotation.*;
import pet.project.demo.telegram.domain.Update;


@RestController
@RequestMapping("api/telegram/bot")
public class Controller {
    @PostMapping("/update")
    public String profile(String update) {
        return "";
    }
}
