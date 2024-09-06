package petProject.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.api.methods.updates.SetWebhook;

@SpringBootApplication
public class BotApplication {

	public static void main(String[] args) {
		SetWebhook setWebhook = new SetWebhook("https://api.telegram.org/bot7233245716:AAFe_O5kLF0N83F1pqHuoQpJS0UfmMN_Pts/setWebhook?url=https://281e-88-201-206-34.ngrok-free.app");
		SpringApplication.run(BotApplication.class, args);

	}

}
