package com.springboot.quickstart;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Springboot 的启动主类
@SpringBootApplication
//@MapperScan("com.springboot.mybatis.mapper")
@EnableSwagger2Doc

public class QuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickstartApplication.class, args);
    }

}
