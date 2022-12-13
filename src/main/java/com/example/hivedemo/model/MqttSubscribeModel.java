package com.example.hivedemo.model;

import lombok.Data;

@Data
public class MqttSubscribeModel {

    private String message;
    private Integer qos;
    private Integer id;

}
