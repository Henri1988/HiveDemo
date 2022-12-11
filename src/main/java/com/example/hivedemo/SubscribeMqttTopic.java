package com.example.hivedemo;

import org.eclipse.paho.client.mqttv3.MqttException;

public class SubscribeMqttTopic {

    public void subscribe(final String topic) throws MqttException, InterruptedException {
        System.out.println("Messages received:");

        Mqtt.getInstance().subscribeWithResponse(topic, (tpic, msg) -> {
            System.out.println(msg.getId() + " -> " + new String(msg.getPayload()));
        });
    }
}
