package cn.enjoy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.*;

// @RestController
// @EnableAutoConfiguration
@SpringBootApplication
@MapperScan("cn.enjoy.dao")
@EnableTransactionManagement
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}