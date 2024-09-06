package pet.project.demo.telegram.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pet.project.demo.telegram.domain.webhook.SetWebhookPayload;


@FeignClient(name="telegramApi", url="https://api.telegram.org/")
public interface TelegramAPI {
    @RequestMapping(method = RequestMethod.GET, value = "/bot{token}/setWebhook")
    feign.Response setWebhook(@PathVariable("token") String token, SetWebhookPayload setWebhookPayload);
}