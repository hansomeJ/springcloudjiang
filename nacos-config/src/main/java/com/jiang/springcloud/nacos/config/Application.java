package com.jiang.springcloud.nacos.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws InterruptedException {
       ConfigurableApplicationContext application = SpringApplication.run(Application.class);
//       while (true) {
           String name = application.getEnvironment().getProperty("user.name");
           String age = application.getEnvironment().getProperty("user.age");
           System.err.println(name + age);
           TimeUnit.SECONDS.sleep(1);
//       }

    }
}
