package com.example.hivedemo.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Data
public class MqttPublishModel {

    @Size(min = 1,max = 255)
    private String topic;

    @Size(min = 1,max = 255)
    private String message;

    private Boolean retained;

    private Integer qos;


}
