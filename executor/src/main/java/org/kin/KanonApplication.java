package org.kin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by kinakihiro on 2017/4/6.
 */
@SpringBootApplication
@MapperScan(basePackages = "org.kin.dao")
public class KanonApplication {

    public static void main(String[] args) {
        SpringApplication.run(KanonApplication.class,args);
        System.out.println("application kanon start!");

    }

}
