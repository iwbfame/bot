package pet.project.demo.telegram;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pet.project.demo.telegram.client.TelegramClient;

import java.io.IOException;

@Service
public class TelegramService {

    private final TelegramClient telegramClient;

    @Autowired
    public TelegramService(TelegramClient telegramClient) {
        this.telegramClient = telegramClient;
    }

    @PostConstruct
    public void registerBot() throws IOException {
        telegramClient.setWebhook();
    }
}
