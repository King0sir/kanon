package org.kin.utils.remote;

import com.alibaba.cloudapi.sdk.core.model.ApiResponse;
import org.kin.utils.StockService;

/**
 * Created by kinakihiro on 2017/4/6.
 */
public class StockRemoteService {

    private StockService syncClient = null;

    public StockRemoteService() {
        this.syncClient = StockService.newBuilder()
                .appKey("23736483")
                .appSecret("227780a6f677c46b771629ea75796df1")
                .build();
    }

    public void queryStockList() {
        ApiResponse response = syncClient.queryStockList("sh", "1");
        printResponse(response);
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
