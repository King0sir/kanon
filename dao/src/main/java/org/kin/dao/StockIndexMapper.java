package org.kin.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.kin.domain.StockIndex;
import org.kin.domain.StockIndexExample;

public interface StockIndexMapper {
    int countByExample(StockIndexExample example);

    int deleteByExample(StockIndexExample example);

    int deleteByPrimaryKey(String code);

    int insert(StockIndex record);

    int insertSelective(StockIndex record);

    List<StockIndex> selectByExample(StockIndexExample example);

    StockIndex selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") StockIndex record, @Param("example") StockIndexExample example);

    int updateByExample(@Param("record") StockIndex record, @Param("example") StockIndexExample example);

    int updateByPrimaryKeySelective(StockIndex record);

    int updateByPrimaryKey(StockIndex record);
}