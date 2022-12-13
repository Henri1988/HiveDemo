package com.example.hivedemo.subscribe;
import com.example.hivedemo.MqttConnection;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@Slf4j
@RestController
public class HiveIotSubscribeController {

    public static void subscribe(final String topic) throws MqttException, InterruptedException {

        MqttConnection.getInstance().subscribeWithResponse(topic, (tpic, msg) -> {
            log.info("Messages received:");
            System.out.println(msg.getId() + " -> " + new String(msg.getPayload()));
        });
    }

}
