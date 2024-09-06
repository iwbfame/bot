package petProject.demo.Controller;

import org.springframework.web.bind.annotation.*;
import petProject.demo.TelegramApi.Update;


@RestController
@RequestMapping("api/telegram/bot")
public class Controller {
    @PostMapping("/update")
    public String profile(Update update) {
        return "";
    }
}
