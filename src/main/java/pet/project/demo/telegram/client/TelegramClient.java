package pet.project.demo.telegram.client;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pet.project.demo.config.TelegramConfiguration;
import pet.project.demo.telegram.domain.webhook.SetWebhookPayload;

@Component
public class TelegramClient {

    private final ObjectProvider<TelegramAPI> telegramApi;
    private final TelegramConfiguration telegramConfiguration;

    @Autowired
    public TelegramClient(ObjectProvider<TelegramAPI> telegramApi, TelegramConfiguration telegramConfiguration) {
        this.telegramApi = telegramApi;
        this.telegramConfiguration = telegramConfiguration;
    }

    public void setWebhook() {
        SetWebhookPayload setWebhookPayload = new SetWebhookPayload();
        setWebhookPayload.setUrl(telegramConfiguration.getUrl());
        feign.Response response = telegramApi.getIfAvailable().setWebhook(telegramConfiguration.getToken(), setWebhookPayload);
        System.out.println();
    }

}
