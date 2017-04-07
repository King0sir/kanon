package org.kin.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.kin.domain.Stocks;
import org.kin.domain.StocksExample;

public interface StocksMapper {
    int countByExample(StocksExample example);

    int deleteByExample(StocksExample example);

    int deleteByPrimaryKey(String code);

    int insert(Stocks record);

    int insertSelective(Stocks record);

    List<Stocks> selectByExample(StocksExample example);

    Stocks selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") Stocks record, @Param("example") StocksExample example);

    int updateByExample(@Param("record") Stocks record, @Param("example") StocksExample example);

    int updateByPrimaryKeySelective(Stocks record);

    int updateByPrimaryKey(Stocks record);
}