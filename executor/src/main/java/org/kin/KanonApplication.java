package org.kin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by kinakihiro on 2017/4/6.
 */
@SpringBootApplication
public class KanonApplication {

    public static void main(String[] args) {
        SpringApplication.run(KanonApplication.class,args);
        System.out.println("application kanon start!");

    }

//        public static void main(String [] args) {
//            System.exit(SpringApplication.exit(SpringApplication.run(
//                    BatchConfiguration.class, args)));
//        }
}
