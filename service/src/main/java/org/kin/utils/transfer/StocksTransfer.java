package org.kin.utils.transfer;

import org.kin.domain.Stocks;
import org.kin.po.stocks.StockListPo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

/**
 * Created by kinakihiro on 2017/5/14.
 */
public class StocksTransfer {

    public static Stocks transfer(StockListPo.ShowapiResBodyBean.ContentlistBean bean){
        return new Stocks(
                bean.getCode(),
                bean.getMarket(),
                bean.getName(),
                bean.getPinyin(),
                new BigDecimal(bean.getCurrcapital()),
                new BigDecimal(bean.getTotalcapital()),
                new BigDecimal(bean.getProfit_four()),
                new BigDecimal(bean.getMgjzc()),
                Date.from(LocalDate.parse(bean.getListing_date()).atStartOfDay().atZone(ZoneId.of("Asia/Shanghai")).toInstant())
        );
    }
}
