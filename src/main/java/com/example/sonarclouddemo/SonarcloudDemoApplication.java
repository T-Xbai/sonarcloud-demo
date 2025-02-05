package com.example.sonarclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping
@RestController
public class SonarcloudDemoApplication {

    @GetMapping("/api")
    public String demo(@RequestParam Boolean res){

        if (res){
            return demo1();
        }else {
            return demo2();
        }
    }

    public String demo1(){
        return "demo1";
    }

    public String demo2(){
        return "demo2";
    }
    public static void main(String[] args) {
        SpringApplication.run(SonarcloudDemoApplication.class, args);
    }

}
