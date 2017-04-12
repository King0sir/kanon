package org.kin.utils;

import com.alibaba.cloudapi.sdk.core.BaseApiClient;
import com.alibaba.cloudapi.sdk.core.BaseApiClientBuilder;
import com.alibaba.cloudapi.sdk.core.annotation.ThreadSafe;
import com.alibaba.cloudapi.sdk.core.enums.Method;
import com.alibaba.cloudapi.sdk.core.enums.Scheme;
import com.alibaba.cloudapi.sdk.core.model.ApiRequest;
import com.alibaba.cloudapi.sdk.core.model.ApiResponse;
import com.alibaba.cloudapi.sdk.core.model.BuilderParams;
import org.joda.time.DateTime;
import org.kin.enums.FuQuanType;
import org.kin.enums.KLineTime;
import org.kin.enums.StockMarket;

import java.util.List;

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

    /**
     * 股票列表查询
     * @param market 股市列表: sh, sz, hk
     * @param page 分页: 从 1 开始 第几页。每页最多返回50条记录
     * @return
     */
    public ApiResponse stockList(StockMarket market, int page) {
        String path = "/stocklist";

        ApiRequest apiRequest = new ApiRequest(Scheme.HTTPS, Method.GET, HOST, path);

        apiRequest.addQueryParam("market", String.valueOf(market.getCode()));
        apiRequest.addQueryParam("page", String.valueOf(page));

        return syncInvoke(apiRequest);
    }

    /**
     * 沪深股票最新50条逐笔交易
     * @param code 股票编码，比如000002，也可以使用拼音首字母。例如腾讯控股的是 txkg
     * @return
     */
    public ApiResponse recentTrade(String code) {
        String path = "/everytrade";

        ApiRequest apiRequest = new ApiRequest(Scheme.HTTPS, Method.GET, HOST, path);

        apiRequest.addQueryParam("code", String.valueOf(code));

        return syncInvoke(apiRequest);
    }

    /**
     * 股票实时分时线数据
     * @param code  沪深和港股的股票编码，不需要写市场名称
     * @param day  返回多少天的分时线数据，1代表的就是当天。目前支持1至5的范围。
     * @return
     */
    public ApiResponse timeLine(String code, int day) {
        String path = "/timeline";

        ApiRequest apiRequest = new ApiRequest(Scheme.HTTPS, Method.GET, HOST, path);

        apiRequest.addQueryParam("code", String.valueOf(code));
        apiRequest.addQueryParam("day", String.valueOf(day));

        return syncInvoke(apiRequest);
    }

    /**
     * 股指列表查询
     * @param market 市场简写。支持 sh、sz、hk
     * @param page  第几页。每页最多返回50条记录
     * @return
     */
    public ApiResponse stockIndexList(StockMarket market, int page) {
        String path = "/stockindexsearch";

        ApiRequest apiRequest = new ApiRequest(Scheme.HTTPS, Method.GET, HOST, path);

        apiRequest.addQueryParam("market", String.valueOf(market.getCode()));
        apiRequest.addQueryParam("page", String.valueOf(page));

        return syncInvoke(apiRequest);
    }

    /**
     * 股票实时行情_批量
     * @param stockList 股票编码，需要带上市场名称。多个股票代码间以英文逗号分隔，最多输入200个代码。
     * @param needIndex 是否需要返回股票指数。1为需要，0为不需要。
     */
    public ApiResponse batchInfo(List<String> stockList, boolean needIndex) {
        String path = "/batch-real-stockinfo";

        ApiRequest apiRequest = new ApiRequest(Scheme.HTTPS, Method.GET, HOST, path);

        StringBuilder stocks = new StringBuilder();
        for(String stock : stockList){
            stocks.append(stock);stocks.append(",");
        }
        stocks.deleteCharAt(stocks.lastIndexOf(","));
        apiRequest.addQueryParam("stocks", stocks.toString());
        apiRequest.addQueryParam("needIndex", needIndex?"1":"0");

        return syncInvoke(apiRequest);
    }

    /**
     * 股指实时K线数据
     * @param code 股指编码，不要写市场名，直接写
     * @param time 查询的周期。 5 = 5分k线(默认) 30 = 30分k线 60 = 60分k线
     *             day = 日k线 week = 周k线 month = 月k线 注意：港股股指只有day以上的K线。
     * @param beginDay 开始时间，格式为yyyyMMdd，如果不写则默认是当天。结束时间永远是当前时间
     */
    public ApiResponse indexKline(String code, KLineTime time, DateTime beginDay) {
        String path = "/index-kline";

        ApiRequest apiRequest = new ApiRequest(Scheme.HTTPS, Method.GET, HOST, path);

        apiRequest.addQueryParam("code", String.valueOf(code));
        apiRequest.addQueryParam("time", String.valueOf(time.getCode()));
        apiRequest.addQueryParam("beginDay", DateUtils.parseShortDate(beginDay));

        return syncInvoke(apiRequest);
    }

    /**
     * 股票实时K线数据
     * @param code 沪深、港股股票编码
     * @param time 5 = 5分k线(默认) ，30 = 30分k线，60 = 60分k线，day = 日k线，
     *             week = 周k线，month = 月k线。注意港股不支持5分、30分和60分k线。
     * @param beginDay 开始时间，格式为yyyyMMdd，如果不写则默认是当天。结束时间永远是当前时间
     * @param type 复权方式，支持两种方式 。 bfq =不复权(默认方式) qfq =前复权。
     *             当time为[day,week,month]时此字段有效。
     */
    public ApiResponse kline(String code, KLineTime time, DateTime beginDay, FuQuanType type) {
        String path = "/realtime-k";

        ApiRequest apiRequest = new ApiRequest(Scheme.HTTPS, Method.GET, HOST, path);

        apiRequest.addQueryParam("code", String.valueOf(code));
        apiRequest.addQueryParam("time", String.valueOf(time.getCode()));
        apiRequest.addQueryParam("beginDay", DateUtils.parseShortDate(beginDay));
        apiRequest.addQueryParam("type", String.valueOf(type.getCode()));

        return syncInvoke(apiRequest);
    }

    /**
     * 股指实时分时线
     * @param code 股指编码，不需要写市场名称
     * @param day 返回多少天的分时线数据，1代表的就是当天。
     *            目前支持1至5的范围。 不写则默认1
     */
    public ApiResponse indexTimeLine(String code, String day) {
        String path = "/index-timeline";

        ApiRequest apiRequest = new ApiRequest(Scheme.HTTPS, Method.GET, HOST, path);

        apiRequest.addQueryParam("code", String.valueOf(code));
        apiRequest.addQueryParam("day", String.valueOf(day));

        return syncInvoke(apiRequest);
    }

    /**
     * 股指实时行情_批量
     * @param stockList 股指编码以逗号分隔，
     *               如果不写，则默认为sh000001,sz399001,sz399005,sz399006,hkhsi
     */
    public ApiResponse batchIndexInfo(List<String> stockList) {
        String path = "/stockIndex";

        ApiRequest apiRequest = new ApiRequest(Scheme.HTTPS, Method.GET, HOST, path);
        StringBuilder stocks = new StringBuilder();
        for(String stock : stockList){
            stocks.append(stock);stocks.append(",");
        }

        apiRequest.addQueryParam("stocks", stocks.toString());

        return syncInvoke(apiRequest);
    }

    /**
     * 名称编码拼音查询股票信息
     * 股票行情，包括股票实时行情、指标、历史行情，可查询沪深股市、香港股市。
     * @param code 比如002739,不需要输入市场编码。
     *             支持模糊查询，至少输入3位code，系统返回匹配的前100条记录
     * @param name 要查询的股票名称
     * @param pinyin 拼音首字母，可前置模糊查询
     */
    public ApiResponse nameToInfo(String code, String name, String pinyin) {
        String path = "/name-to-stockinfo";

        ApiRequest apiRequest = new ApiRequest(Scheme.HTTPS, Method.GET, HOST, path);

        apiRequest.addQueryParam("code", String.valueOf(code));
        apiRequest.addQueryParam("name", String.valueOf(name));
        apiRequest.addQueryParam("pinyin", String.valueOf(pinyin));

        return syncInvoke(apiRequest);
    }

    /**
     * 沪深及港股历史行情
     * @param begin 开始日期，格式yyyy-MM-dd，最早的时间为2000-01-01日。属于未复权数据。
     * @param end 结束日期，格式yyyy-MM-dd，注意时间范围为31天
     * @param code 股票编码，不需要写市场名
     */
    public ApiResponse history(String begin, String end, String code) {
        String path = "/sz-sh-stock-history";

        ApiRequest apiRequest = new ApiRequest(Scheme.HTTPS, Method.GET, HOST, path);

        apiRequest.addQueryParam("begin", String.valueOf(begin));
        apiRequest.addQueryParam("end", String.valueOf(end));
        apiRequest.addQueryParam("code", String.valueOf(code));

        return syncInvoke(apiRequest);
    }

    /**
     * 股票实时行情
     * 根据股票代码获得行情，延时5秒左右。
     * @param code 股票编码，比如000002，也可以使用拼音首字母。例如腾讯控股的是 txkg
     * @param need_k_pic 是否需要返回k线图地址。1为需要，0为不需要。
     * @param needIndex 是否需要返回指数信息。1为需要，0为不需要。
     */
    public ApiResponse info(String code, String need_k_pic, String needIndex) {
        String path = "/real-stockinfo";

        ApiRequest apiRequest = new ApiRequest(Scheme.HTTPS, Method.GET, HOST, path);

        apiRequest.addQueryParam("code", String.valueOf(code));
        apiRequest.addQueryParam("need_k_pic", String.valueOf(need_k_pic));
        apiRequest.addQueryParam("needIndex", String.valueOf(needIndex));

        return syncInvoke(apiRequest);
    }
}
