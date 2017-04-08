package org.kin;

import com.alibaba.cloudapi.sdk.core.model.ApiResponse;
import org.kin.utils.StockService;

/**
 * Created by kinakihiro on 2017/4/6.
 */
public class StockServiceFactory {

    private static StockService syncClient = null;

    private StockServiceFactory(){}

    public static StockService createStockService(){
        if(syncClient != null) {
            return syncClient;
        }
        syncClient = StockService.newBuilder()
                .appKey("23736483")
                .appSecret("227780a6f677c46b771629ea75796df1")
                .build();
        return syncClient;
    }

    private static void printResponse(ApiResponse response) {
        try {
            System.out.println("response code = " + response.getStatusCode());
            System.out.println("response content = " + new String(response.getBody(), "utf-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
