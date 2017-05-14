package org.kin.service.impl;

import org.kin.dao.StocksMapper;
import org.kin.domain.Stocks;
import org.kin.enums.StockMarket;
import org.kin.po.stocks.StockListPo;
import org.kin.service.ISavingService;
import org.kin.service.impl.stocks.RemoteService;
import org.kin.utils.transfer.StocksTransfer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by kinakihiro on 2017/5/14.
 */
@Service
public class SavingImpl implements ISavingService {

    Logger logger = LoggerFactory.getLogger(SavingImpl.class);

    @Resource
    RemoteService remoteService;

    @Resource
    StocksMapper stocksMapper;

    @Override
    public void savingStocks() {
        int page = 1;
        int allPage = Integer.MAX_VALUE;
        while (page <= allPage) {
            StockListPo stockList = remoteService.getStockList(StockMarket.ShangHai, page);
            if (stockList.getShowapi_res_code() != 0) {
                return;
            }
            allPage = stockList.getShowapi_res_body().getAllPages();
            stockList.getShowapi_res_body().getContentlist().forEach(contentlistBean -> {
                stocksMapper.insertSelective(StocksTransfer.transfer(contentlistBean));
            });
            page++;
        }
    }
}
