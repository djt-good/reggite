package com.djt;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@Slf4j
@SpringBootApplication(exclude= DataSourceAutoConfiguration.class )
@MapperScan("com.djt.mapper")
@ServletComponentScan
public class ReggitApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReggitApplication.class, args);
    }

}
