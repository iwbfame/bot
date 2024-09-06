package pet.project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BotApplication {

	public static void main(String[] args) {
//		SetWebhook setWebhook = new SetWebhook("https://api.telegram.org/bot7233245716:AAFe_O5kLF0N83F1pqHuoQpJS0UfmMN_Pts/setWebhook?url=https://82ef-62-228-95-96.ngrok-free.app/api/telegram/bot/update");
		SpringApplication.run(BotApplication.class, args);

	}

}
