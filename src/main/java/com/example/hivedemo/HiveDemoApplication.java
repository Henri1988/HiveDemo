package com.example.hivedemo;

import lombok.Value;
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


    //Connecting to hive broker
    @Bean
    public MqttPahoClientFactory mqttClientFactory(@Value ("${hivemq.uri}") String host ) {
        DefaultMqttPahoClientFactory factory = new DefaultMqttPahoClientFactory();
        MqttConnectOptions options = new MqttConnectOptions();
        options.setServerURIs(new String[] {host});
        factory.setConnectionOptions(options);
        return factory;
    }

}
