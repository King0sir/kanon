package org.kin;

import org.kin.dao.StocksMapper;
import org.kin.domain.StocksExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

/**
 * Created by kinakihiro on 2017/4/6.
 */
@SpringBootApplication
public class KanonApplication {

    public static void main(String[] args) {
        SpringApplication.run(KanonApplication.class,args);
        System.out.println("application kanon start!");

    }
}
