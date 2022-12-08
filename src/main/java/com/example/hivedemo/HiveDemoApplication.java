package com.example.hivedemo;

import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.mqtt.core.DefaultMqttPahoClientFactory;
import org.springframework.integration.mqtt.core.MqttPahoClientFactory;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HiveDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HiveDemoApplication.class, args);
    }

    @Bean
    MqttPahoClientFactory clientFactory (){
        var factory = new DefaultMqttPahoClientFactory();
        var options = new MqttConnectOptions();

        options.setServerURIs();
    }

}
