package org.kin.utils;

import com.alibaba.cloudapi.sdk.core.BaseApiClient;
import com.alibaba.cloudapi.sdk.core.BaseApiClientBuilder;
import com.alibaba.cloudapi.sdk.core.annotation.ThreadSafe;
import com.alibaba.cloudapi.sdk.core.enums.Method;
import com.alibaba.cloudapi.sdk.core.enums.Scheme;
import com.alibaba.cloudapi.sdk.core.model.ApiRequest;
import com.alibaba.cloudapi.sdk.core.model.ApiResponse;
import com.alibaba.cloudapi.sdk.core.model.BuilderParams;

/**
 * Created by kinakihiro on 2017/4/6.
 */
@ThreadSafe
public class StockService extends BaseApiClient{
    public final static String HOST = "ali-stock.showapi.com";

    public StockService(BuilderParams builderParams) {
        super(builderParams);
    }

    public static class Builder extends BaseApiClientBuilder<StockService.Builder,StockService>{
        @Override
        protected StockService build(BuilderParams params) {
            return new StockService(params);
        }
    }

    public static Builder newBuilder() {
        return new StockService.Builder();
    }

    public ApiResponse queryStockList(String market, String page) {
        String path = "/stockindexsearch";

        ApiRequest apiRequest = new ApiRequest(Scheme.HTTP, Method.GET, HOST, path);

        apiRequest.addQueryParam("market", String.valueOf(market));
        apiRequest.addQueryParam("page", String.valueOf(page));

        return syncInvoke(apiRequest);
    }
}
