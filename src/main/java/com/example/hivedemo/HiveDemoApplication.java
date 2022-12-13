package com.example.hivedemo;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.IMqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.PrintWriter;
import java.io.StringWriter;

import static com.example.hivedemo.subscribe.HiveIotSubscribeController.subscribe;

@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HiveDemoApplication {


    public static void main(String[] args) throws MqttException, InterruptedException {

        publish2Messages();
        subscribe("metrics");
        SpringApplication.run(HiveDemoApplication.class, args);
    }

    private static void publish2Messages() throws MqttException {

        MqttMessage mqttMessage = new MqttMessage();
        mqttMessage.setPayload("6573".getBytes());
        mqttMessage.setQos(2);
        mqttMessage.setRetained(false);
        //singleton
        MqttConnection.getInstance().publish("metrics", mqttMessage);

        MqttConnection.getInstance().disconnect();
        log.info("Connection disconnected");
    }
}
