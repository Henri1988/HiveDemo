package com.example.hivedemo;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;




@RestController
public class HiveIotSimulatorController {


    @Resource
    private HiveIotSimulatorService hiveIotSimulatorService;


}
