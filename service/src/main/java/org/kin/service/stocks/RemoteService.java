package org.kin.service.stocks;

import com.alibaba.cloudapi.sdk.core.model.ApiResponse;
import com.alibaba.fastjson.JSONObject;
import org.kin.StockServiceFactory;
import org.kin.enums.StockMarket;
import org.kin.po.stocks.StockListPo;
import org.kin.utils.StockService;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

/**
 * Created by kinakihiro on 2017/5/14.
 */
@Service
public class RemoteService {

    StockService stockClient;

    public RemoteService() {
        this.stockClient = StockServiceFactory.createStockService();
    }

    public StockListPo getStockList() {
        ApiResponse response = stockClient.stockList(StockMarket.ShangHai, 1);
        try {
            String body = new String(response.getBody(), "utf-8");

            StockListPo stockList = JSONObject.parseObject(body,StockListPo.class);
            return stockList;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
