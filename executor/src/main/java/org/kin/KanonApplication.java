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

    @Resource
    private static StocksMapper mapper;
    public static void main(String[] args) {
        SpringApplication.run(KanonApplication.class,args);
        System.out.println("application kanon start!");

        StocksExample example = new StocksExample();
        StocksExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo("abcv").andMarketNotLike("laksdjfklajsd");
        mapper.selectByExample(example);
    }
}
