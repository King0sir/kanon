package org.kin.po.stocks;

import java.io.Serializable;
import java.util.List;

/**
 * Created by kinakihiro on 2017/5/14.
 */
public class StockListPo implements Serializable{

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"allPages":27,"contentlist":[{"market":"sh","name":"N金牌","currcapital":"1700","state":"1","profit_four":"0.0000","code":"603180","mgjzc":"5.474419","totalcapital":"6700","listing_date":"2017-05-12","pinyin":"njp"},{"market":"sh","name":"金能科技","currcapital":"7730","state":"1","profit_four":"0.0000","code":"603113","mgjzc":"4.021066","totalcapital":"67593.9455","listing_date":"2017-05-11","pinyin":"jnkj"},{"market":"sh","name":"先达股份","currcapital":"2000","state":"1","profit_four":"0.0000","code":"603086","mgjzc":"12.120362","totalcapital":"8000","listing_date":"2017-05-11","pinyin":"xdgf"},{"market":"sh","name":"铁流股份","currcapital":"3000","state":"1","profit_four":"0.0000","code":"603926","mgjzc":"5.845551","totalcapital":"12000","listing_date":"2017-05-10","pinyin":"tlgf"},{"market":"sh","name":"寿仙谷","currcapital":"3495","state":"1","profit_four":"0.0000","code":"603896","mgjzc":"4.167149","totalcapital":"13980","listing_date":"2017-05-10","pinyin":"sxg"},{"market":"sh","name":"鸣志电器","currcapital":"8000","state":"1","profit_four":"0.0000","code":"603728","mgjzc":"3.137497","totalcapital":"32000","listing_date":"2017-05-09","pinyin":"mzdq"},{"market":"sh","name":"奥翔药业","currcapital":"4000","state":"1","profit_four":"0.0000","code":"603229","mgjzc":"2.127800","totalcapital":"16000","listing_date":"2017-05-09","pinyin":"axyy"},{"market":"sh","name":"恒润股份","currcapital":"2000","state":"1","profit_four":"0.0000","code":"603985","mgjzc":"7.647692","totalcapital":"8000","listing_date":"2017-05-05","pinyin":"hrgf"},{"market":"sh","name":"韦尔股份","currcapital":"4160","state":"1","profit_four":"0.0000","code":"603501","mgjzc":"2.223224","totalcapital":"41600","listing_date":"2017-05-04","pinyin":"wegf"},{"market":"sh","name":"金石资源","currcapital":"6000","state":"1","profit_four":"0.0000","code":"603505","mgjzc":"2.638756","totalcapital":"24000","listing_date":"2017-05-03","pinyin":"jszy"},{"market":"sh","name":"迪贝电气","currcapital":"2500","state":"1","profit_four":"0.0000","code":"603320","mgjzc":"4.579507","totalcapital":"10000","listing_date":"2017-05-02","pinyin":"dbdq"},{"market":"sh","name":"新日股份","currcapital":"5100","state":"1","profit_four":"0.0000","code":"603787","mgjzc":"3.583475","totalcapital":"20400","listing_date":"2017-04-27","pinyin":"xrgf"},{"market":"sh","name":"世运电路","currcapital":"8880","state":"1","profit_four":"0.0000","code":"603920","mgjzc":"3.084547","totalcapital":"40180","listing_date":"2017-04-26","pinyin":"sydl"},{"market":"sh","name":"新经典","currcapital":"3336","state":"1","profit_four":"0.0000","code":"603096","mgjzc":"7.104652","totalcapital":"13336","listing_date":"2017-04-25","pinyin":"xjd"},{"market":"sh","name":"格尔软件","currcapital":"1525","state":"1","profit_four":"0.0000","code":"603232","mgjzc":"6.464492","totalcapital":"6100","listing_date":"2017-04-21","pinyin":"gerj"},{"market":"sh","name":"康惠制药","currcapital":"2497","state":"1","profit_four":"0.0000","code":"603139","mgjzc":"7.170112","totalcapital":"9988","listing_date":"2017-04-21","pinyin":"khzy"},{"market":"sh","name":"瑞斯康达","currcapital":"5680","state":"1","profit_four":"0.0000","code":"603803","mgjzc":"4.451408","totalcapital":"42105.5557","listing_date":"2017-04-20","pinyin":"rskd"},{"market":"sh","name":"大丰实业","currcapital":"5180","state":"1","profit_four":"0.0000","code":"603081","mgjzc":"2.459800","totalcapital":"40180","listing_date":"2017-04-20","pinyin":"dfsy"},{"market":"sh","name":"新凤鸣","currcapital":"7730","state":"1","profit_four":"8.7949","code":"603225","mgjzc":"6.304528","totalcapital":"60200","listing_date":"2017-04-18","pinyin":"xfm"},{"market":"sh","name":"坤彩科技","currcapital":"9000","state":"1","profit_four":"0.0000","code":"603826","mgjzc":"1.924799","totalcapital":"36000","listing_date":"2017-04-14","pinyin":"kckj"},{"market":"sh","name":"科林电气","currcapital":"3334","state":"1","profit_four":"0.0000","code":"603050","mgjzc":"6.254008","totalcapital":"13334","listing_date":"2017-04-14","pinyin":"kldq"},{"market":"sh","name":"联泰环保","currcapital":"5334","state":"1","profit_four":"0.0000","code":"603797","mgjzc":"4.447085","totalcapital":"21334","listing_date":"2017-04-13","pinyin":"lthb"},{"market":"sh","name":"美诺华","currcapital":"3000","state":"1","profit_four":"0.0000","code":"603538","mgjzc":"9.202849","totalcapital":"12000","listing_date":"2017-04-07","pinyin":"mnh"},{"market":"sh","name":"利群股份","currcapital":"17600","state":"1","profit_four":"0.0000","code":"601366","mgjzc":"4.150620","totalcapital":"86050.046","listing_date":"2017-04-12","pinyin":"lqgf"},{"market":"sh","name":"龙蟠科技","currcapital":"5200","state":"1","profit_four":"0.0000","code":"603906","mgjzc":"5.424394","totalcapital":"20800","listing_date":"2017-04-10","pinyin":"lpkj"},{"market":"sh","name":"江化微","currcapital":"1500","state":"1","profit_four":"0.0000","code":"603078","mgjzc":"11.767427","totalcapital":"6000","listing_date":"2017-04-10","pinyin":"jhw"},{"market":"sh","status":"0","name":"金麒麟","currcapital":"5250","state":"1","profit_four":"0.0000","code":"603586","mgjzc":"9.485766","totalcapital":"20937","listing_date":"2017-04-06","pinyin":"jql"},{"market":"sh","status":"0","name":"惠达卫浴","currcapital":"7104","state":"1","profit_four":"0.0000","code":"603385","mgjzc":"9.874880","totalcapital":"28415.1111","listing_date":"2017-04-05","pinyin":"hdwy"},{"market":"sh","status":"0","name":"欧派家居","currcapital":"4151","state":"1","profit_four":"0.0000","code":"603833","mgjzc":"11.911125","totalcapital":"41509.1112","listing_date":"2017-03-28","pinyin":"opjj"},{"market":"sh","status":"0","name":"得邦照明","currcapital":"6000","state":"1","profit_four":"0.0000","code":"603303","mgjzc":"9.549607","totalcapital":"24000","listing_date":"2017-03-30","pinyin":"dbzm"},{"market":"sh","status":"0","name":"上海环境","currcapital":"31118.31","state":"1","profit_four":"5.1100","code":"601200","mgjzc":"7.184248","totalcapital":"70254.3884","listing_date":"2017-03-31","pinyin":"shhj"},{"market":"sh","status":"0","name":"美思德","currcapital":"2500","state":"1","profit_four":"0.0000","code":"603041","mgjzc":"6.722801","totalcapital":"10000","listing_date":"2017-03-30","pinyin":"msd"},{"market":"sh","status":"0","name":"广州港","currcapital":"69868","state":"1","profit_four":"7.0843","code":"601228","mgjzc":"1.889168","totalcapital":"619318","listing_date":"2017-03-29","pinyin":"gzg"},{"market":"sh","status":"0","name":"圣龙股份","currcapital":"5000","state":"1","profit_four":"0.8359","code":"603178","mgjzc":"3.877050","totalcapital":"20000","listing_date":"2017-03-28","pinyin":"slgf"},{"market":"sh","status":"0","name":"天域生态","currcapital":"4317.79","state":"1","profit_four":"0.0000","code":"603717","mgjzc":"6.913845","totalcapital":"17271.16","listing_date":"2017-03-27","pinyin":"tyst"},{"market":"sh","status":"0","name":"常青股份","currcapital":"5100","state":"1","profit_four":"0.0000","code":"603768","mgjzc":"7.672746","totalcapital":"20400","listing_date":"2017-03-24","pinyin":"cqgf"},{"market":"sh","status":"0","name":"元成股份","currcapital":"2500","state":"1","profit_four":"0.0000","code":"603388","mgjzc":"6.809504","totalcapital":"10000","listing_date":"2017-03-24","pinyin":"ycgf"},{"market":"sh","status":"0","name":"泰禾光电","currcapital":"1899","state":"1","profit_four":"0.0000","code":"603656","mgjzc":"10.114907","totalcapital":"7596","listing_date":"2017-03-21","pinyin":"thgd"},{"market":"sh","status":"0","name":"碳元科技","currcapital":"5200","state":"1","profit_four":"0.0000","code":"603133","mgjzc":"4.179706","totalcapital":"20800","listing_date":"2017-03-20","pinyin":"tykj"},{"market":"sh","status":"0","name":"克来机电","currcapital":"2000","state":"1","profit_four":"0.0000","code":"603960","mgjzc":"5.156470","totalcapital":"8000","listing_date":"2017-03-14","pinyin":"kljd"},{"market":"sh","status":"0","name":"绝味食品","currcapital":"5000","state":"1","profit_four":"3.7679","code":"603517","mgjzc":"5.668832","totalcapital":"41000","listing_date":"2017-03-17","pinyin":"jwsp"},{"market":"sh","status":"0","name":"新泉股份","currcapital":"3985","state":"1","profit_four":"0.0000","code":"603179","mgjzc":"7.134464","totalcapital":"15940","listing_date":"2017-03-17","pinyin":"xqgf"},{"market":"sh","status":"0","name":"中持股份","currcapital":"2560.95","state":"1","profit_four":"0.0000","code":"603903","mgjzc":"6.444936","totalcapital":"10243.8","listing_date":"2017-03-14","pinyin":"zcgf"},{"market":"sh","status":"0","name":"诚意药业","currcapital":"2130","state":"1","profit_four":"0.0000","code":"603811","mgjzc":"6.780193","totalcapital":"8520","listing_date":"2017-03-15","pinyin":"cyyy"},{"market":"sh","status":"0","name":"康隆达","currcapital":"2500","state":"1","profit_four":"0.8310","code":"603665","mgjzc":"8.917272","totalcapital":"10000","listing_date":"2017-03-13","pinyin":"kld"},{"market":"sh","status":"0","name":"拉芳家化","currcapital":"4360","state":"1","profit_four":"0.0000","code":"603630","mgjzc":"9.331415","totalcapital":"17440","listing_date":"2017-03-13","pinyin":"lfjh"},{"market":"sh","status":"0","name":"大千生态","currcapital":"2175","state":"1","profit_four":"0.6980","code":"603955","mgjzc":"11.314443","totalcapital":"8700","listing_date":"2017-03-10","pinyin":"dqst"},{"market":"sh","status":"0","name":"至正股份","currcapital":"1870","state":"1","profit_four":"0.0000","code":"603991","mgjzc":"5.772907","totalcapital":"7453.4998","listing_date":"2017-03-08","pinyin":"zzgf"},{"market":"sh","status":"0","name":"牧高笛","currcapital":"1669","state":"1","profit_four":"0.0000","code":"603908","mgjzc":"6.694347","totalcapital":"6669","listing_date":"2017-03-07","pinyin":"mgd"},{"market":"sh","status":"0","name":"三星新材","currcapital":"2200","state":"1","profit_four":"0.0000","code":"603578","mgjzc":"5.171350","totalcapital":"8800","listing_date":"2017-03-06","pinyin":"sxxc"}],"currentPage":1,"allNum":1322,"maxResult":50}
     */

    private int showapi_res_code;
    private String showapi_res_error;
    private ShowapiResBodyBean showapi_res_body;

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        /**
         * allPages : 27
         * contentlist : [{"market":"sh","name":"N金牌","currcapital":"1700","state":"1","profit_four":"0.0000","code":"603180","mgjzc":"5.474419","totalcapital":"6700","listing_date":"2017-05-12","pinyin":"njp"},{"market":"sh","name":"金能科技","currcapital":"7730","state":"1","profit_four":"0.0000","code":"603113","mgjzc":"4.021066","totalcapital":"67593.9455","listing_date":"2017-05-11","pinyin":"jnkj"},{"market":"sh","name":"先达股份","currcapital":"2000","state":"1","profit_four":"0.0000","code":"603086","mgjzc":"12.120362","totalcapital":"8000","listing_date":"2017-05-11","pinyin":"xdgf"},{"market":"sh","name":"铁流股份","currcapital":"3000","state":"1","profit_four":"0.0000","code":"603926","mgjzc":"5.845551","totalcapital":"12000","listing_date":"2017-05-10","pinyin":"tlgf"},{"market":"sh","name":"寿仙谷","currcapital":"3495","state":"1","profit_four":"0.0000","code":"603896","mgjzc":"4.167149","totalcapital":"13980","listing_date":"2017-05-10","pinyin":"sxg"},{"market":"sh","name":"鸣志电器","currcapital":"8000","state":"1","profit_four":"0.0000","code":"603728","mgjzc":"3.137497","totalcapital":"32000","listing_date":"2017-05-09","pinyin":"mzdq"},{"market":"sh","name":"奥翔药业","currcapital":"4000","state":"1","profit_four":"0.0000","code":"603229","mgjzc":"2.127800","totalcapital":"16000","listing_date":"2017-05-09","pinyin":"axyy"},{"market":"sh","name":"恒润股份","currcapital":"2000","state":"1","profit_four":"0.0000","code":"603985","mgjzc":"7.647692","totalcapital":"8000","listing_date":"2017-05-05","pinyin":"hrgf"},{"market":"sh","name":"韦尔股份","currcapital":"4160","state":"1","profit_four":"0.0000","code":"603501","mgjzc":"2.223224","totalcapital":"41600","listing_date":"2017-05-04","pinyin":"wegf"},{"market":"sh","name":"金石资源","currcapital":"6000","state":"1","profit_four":"0.0000","code":"603505","mgjzc":"2.638756","totalcapital":"24000","listing_date":"2017-05-03","pinyin":"jszy"},{"market":"sh","name":"迪贝电气","currcapital":"2500","state":"1","profit_four":"0.0000","code":"603320","mgjzc":"4.579507","totalcapital":"10000","listing_date":"2017-05-02","pinyin":"dbdq"},{"market":"sh","name":"新日股份","currcapital":"5100","state":"1","profit_four":"0.0000","code":"603787","mgjzc":"3.583475","totalcapital":"20400","listing_date":"2017-04-27","pinyin":"xrgf"},{"market":"sh","name":"世运电路","currcapital":"8880","state":"1","profit_four":"0.0000","code":"603920","mgjzc":"3.084547","totalcapital":"40180","listing_date":"2017-04-26","pinyin":"sydl"},{"market":"sh","name":"新经典","currcapital":"3336","state":"1","profit_four":"0.0000","code":"603096","mgjzc":"7.104652","totalcapital":"13336","listing_date":"2017-04-25","pinyin":"xjd"},{"market":"sh","name":"格尔软件","currcapital":"1525","state":"1","profit_four":"0.0000","code":"603232","mgjzc":"6.464492","totalcapital":"6100","listing_date":"2017-04-21","pinyin":"gerj"},{"market":"sh","name":"康惠制药","currcapital":"2497","state":"1","profit_four":"0.0000","code":"603139","mgjzc":"7.170112","totalcapital":"9988","listing_date":"2017-04-21","pinyin":"khzy"},{"market":"sh","name":"瑞斯康达","currcapital":"5680","state":"1","profit_four":"0.0000","code":"603803","mgjzc":"4.451408","totalcapital":"42105.5557","listing_date":"2017-04-20","pinyin":"rskd"},{"market":"sh","name":"大丰实业","currcapital":"5180","state":"1","profit_four":"0.0000","code":"603081","mgjzc":"2.459800","totalcapital":"40180","listing_date":"2017-04-20","pinyin":"dfsy"},{"market":"sh","name":"新凤鸣","currcapital":"7730","state":"1","profit_four":"8.7949","code":"603225","mgjzc":"6.304528","totalcapital":"60200","listing_date":"2017-04-18","pinyin":"xfm"},{"market":"sh","name":"坤彩科技","currcapital":"9000","state":"1","profit_four":"0.0000","code":"603826","mgjzc":"1.924799","totalcapital":"36000","listing_date":"2017-04-14","pinyin":"kckj"},{"market":"sh","name":"科林电气","currcapital":"3334","state":"1","profit_four":"0.0000","code":"603050","mgjzc":"6.254008","totalcapital":"13334","listing_date":"2017-04-14","pinyin":"kldq"},{"market":"sh","name":"联泰环保","currcapital":"5334","state":"1","profit_four":"0.0000","code":"603797","mgjzc":"4.447085","totalcapital":"21334","listing_date":"2017-04-13","pinyin":"lthb"},{"market":"sh","name":"美诺华","currcapital":"3000","state":"1","profit_four":"0.0000","code":"603538","mgjzc":"9.202849","totalcapital":"12000","listing_date":"2017-04-07","pinyin":"mnh"},{"market":"sh","name":"利群股份","currcapital":"17600","state":"1","profit_four":"0.0000","code":"601366","mgjzc":"4.150620","totalcapital":"86050.046","listing_date":"2017-04-12","pinyin":"lqgf"},{"market":"sh","name":"龙蟠科技","currcapital":"5200","state":"1","profit_four":"0.0000","code":"603906","mgjzc":"5.424394","totalcapital":"20800","listing_date":"2017-04-10","pinyin":"lpkj"},{"market":"sh","name":"江化微","currcapital":"1500","state":"1","profit_four":"0.0000","code":"603078","mgjzc":"11.767427","totalcapital":"6000","listing_date":"2017-04-10","pinyin":"jhw"},{"market":"sh","status":"0","name":"金麒麟","currcapital":"5250","state":"1","profit_four":"0.0000","code":"603586","mgjzc":"9.485766","totalcapital":"20937","listing_date":"2017-04-06","pinyin":"jql"},{"market":"sh","status":"0","name":"惠达卫浴","currcapital":"7104","state":"1","profit_four":"0.0000","code":"603385","mgjzc":"9.874880","totalcapital":"28415.1111","listing_date":"2017-04-05","pinyin":"hdwy"},{"market":"sh","status":"0","name":"欧派家居","currcapital":"4151","state":"1","profit_four":"0.0000","code":"603833","mgjzc":"11.911125","totalcapital":"41509.1112","listing_date":"2017-03-28","pinyin":"opjj"},{"market":"sh","status":"0","name":"得邦照明","currcapital":"6000","state":"1","profit_four":"0.0000","code":"603303","mgjzc":"9.549607","totalcapital":"24000","listing_date":"2017-03-30","pinyin":"dbzm"},{"market":"sh","status":"0","name":"上海环境","currcapital":"31118.31","state":"1","profit_four":"5.1100","code":"601200","mgjzc":"7.184248","totalcapital":"70254.3884","listing_date":"2017-03-31","pinyin":"shhj"},{"market":"sh","status":"0","name":"美思德","currcapital":"2500","state":"1","profit_four":"0.0000","code":"603041","mgjzc":"6.722801","totalcapital":"10000","listing_date":"2017-03-30","pinyin":"msd"},{"market":"sh","status":"0","name":"广州港","currcapital":"69868","state":"1","profit_four":"7.0843","code":"601228","mgjzc":"1.889168","totalcapital":"619318","listing_date":"2017-03-29","pinyin":"gzg"},{"market":"sh","status":"0","name":"圣龙股份","currcapital":"5000","state":"1","profit_four":"0.8359","code":"603178","mgjzc":"3.877050","totalcapital":"20000","listing_date":"2017-03-28","pinyin":"slgf"},{"market":"sh","status":"0","name":"天域生态","currcapital":"4317.79","state":"1","profit_four":"0.0000","code":"603717","mgjzc":"6.913845","totalcapital":"17271.16","listing_date":"2017-03-27","pinyin":"tyst"},{"market":"sh","status":"0","name":"常青股份","currcapital":"5100","state":"1","profit_four":"0.0000","code":"603768","mgjzc":"7.672746","totalcapital":"20400","listing_date":"2017-03-24","pinyin":"cqgf"},{"market":"sh","status":"0","name":"元成股份","currcapital":"2500","state":"1","profit_four":"0.0000","code":"603388","mgjzc":"6.809504","totalcapital":"10000","listing_date":"2017-03-24","pinyin":"ycgf"},{"market":"sh","status":"0","name":"泰禾光电","currcapital":"1899","state":"1","profit_four":"0.0000","code":"603656","mgjzc":"10.114907","totalcapital":"7596","listing_date":"2017-03-21","pinyin":"thgd"},{"market":"sh","status":"0","name":"碳元科技","currcapital":"5200","state":"1","profit_four":"0.0000","code":"603133","mgjzc":"4.179706","totalcapital":"20800","listing_date":"2017-03-20","pinyin":"tykj"},{"market":"sh","status":"0","name":"克来机电","currcapital":"2000","state":"1","profit_four":"0.0000","code":"603960","mgjzc":"5.156470","totalcapital":"8000","listing_date":"2017-03-14","pinyin":"kljd"},{"market":"sh","status":"0","name":"绝味食品","currcapital":"5000","state":"1","profit_four":"3.7679","code":"603517","mgjzc":"5.668832","totalcapital":"41000","listing_date":"2017-03-17","pinyin":"jwsp"},{"market":"sh","status":"0","name":"新泉股份","currcapital":"3985","state":"1","profit_four":"0.0000","code":"603179","mgjzc":"7.134464","totalcapital":"15940","listing_date":"2017-03-17","pinyin":"xqgf"},{"market":"sh","status":"0","name":"中持股份","currcapital":"2560.95","state":"1","profit_four":"0.0000","code":"603903","mgjzc":"6.444936","totalcapital":"10243.8","listing_date":"2017-03-14","pinyin":"zcgf"},{"market":"sh","status":"0","name":"诚意药业","currcapital":"2130","state":"1","profit_four":"0.0000","code":"603811","mgjzc":"6.780193","totalcapital":"8520","listing_date":"2017-03-15","pinyin":"cyyy"},{"market":"sh","status":"0","name":"康隆达","currcapital":"2500","state":"1","profit_four":"0.8310","code":"603665","mgjzc":"8.917272","totalcapital":"10000","listing_date":"2017-03-13","pinyin":"kld"},{"market":"sh","status":"0","name":"拉芳家化","currcapital":"4360","state":"1","profit_four":"0.0000","code":"603630","mgjzc":"9.331415","totalcapital":"17440","listing_date":"2017-03-13","pinyin":"lfjh"},{"market":"sh","status":"0","name":"大千生态","currcapital":"2175","state":"1","profit_four":"0.6980","code":"603955","mgjzc":"11.314443","totalcapital":"8700","listing_date":"2017-03-10","pinyin":"dqst"},{"market":"sh","status":"0","name":"至正股份","currcapital":"1870","state":"1","profit_four":"0.0000","code":"603991","mgjzc":"5.772907","totalcapital":"7453.4998","listing_date":"2017-03-08","pinyin":"zzgf"},{"market":"sh","status":"0","name":"牧高笛","currcapital":"1669","state":"1","profit_four":"0.0000","code":"603908","mgjzc":"6.694347","totalcapital":"6669","listing_date":"2017-03-07","pinyin":"mgd"},{"market":"sh","status":"0","name":"三星新材","currcapital":"2200","state":"1","profit_four":"0.0000","code":"603578","mgjzc":"5.171350","totalcapital":"8800","listing_date":"2017-03-06","pinyin":"sxxc"}]
         * currentPage : 1
         * allNum : 1322
         * maxResult : 50
         */

        private int allPages;
        private int currentPage;
        private int allNum;
        private int maxResult;
        private List<ContentlistBean> contentlist;

        public int getAllPages() {
            return allPages;
        }

        public void setAllPages(int allPages) {
            this.allPages = allPages;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public int getAllNum() {
            return allNum;
        }

        public void setAllNum(int allNum) {
            this.allNum = allNum;
        }

        public int getMaxResult() {
            return maxResult;
        }

        public void setMaxResult(int maxResult) {
            this.maxResult = maxResult;
        }

        public List<ContentlistBean> getContentlist() {
            return contentlist;
        }

        public void setContentlist(List<ContentlistBean> contentlist) {
            this.contentlist = contentlist;
        }

        public static class ContentlistBean {
            /**
             * market : sh
             * name : N金牌
             * currcapital : 1700
             * state : 1
             * profit_four : 0.0000
             * code : 603180
             * mgjzc : 5.474419
             * totalcapital : 6700
             * listing_date : 2017-05-12
             * pinyin : njp
             * status : 0
             */

            private String market;
            private String name;
            private String currcapital;
            private String state;
            private String profit_four;
            private String code;
            private String mgjzc;
            private String totalcapital;
            private String listing_date;
            private String pinyin;
            private String status;

            public String getMarket() {
                return market;
            }

            public void setMarket(String market) {
                this.market = market;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCurrcapital() {
                return currcapital;
            }

            public void setCurrcapital(String currcapital) {
                this.currcapital = currcapital;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getProfit_four() {
                return profit_four;
            }

            public void setProfit_four(String profit_four) {
                this.profit_four = profit_four;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getMgjzc() {
                return mgjzc;
            }

            public void setMgjzc(String mgjzc) {
                this.mgjzc = mgjzc;
            }

            public String getTotalcapital() {
                return totalcapital;
            }

            public void setTotalcapital(String totalcapital) {
                this.totalcapital = totalcapital;
            }

            public String getListing_date() {
                return listing_date;
            }

            public void setListing_date(String listing_date) {
                this.listing_date = listing_date;
            }

            public String getPinyin() {
                return pinyin;
            }

            public void setPinyin(String pinyin) {
                this.pinyin = pinyin;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            @Override
            public String toString() {
                return "ContentlistBean{" +
                        "market='" + market + '\'' +
                        ", name='" + name + '\'' +
                        ", currcapital='" + currcapital + '\'' +
                        ", state='" + state + '\'' +
                        ", profit_four='" + profit_four + '\'' +
                        ", code='" + code + '\'' +
                        ", mgjzc='" + mgjzc + '\'' +
                        ", totalcapital='" + totalcapital + '\'' +
                        ", listing_date='" + listing_date + '\'' +
                        ", pinyin='" + pinyin + '\'' +
                        ", status='" + status + '\'' +
                        '}';
            }
        }
    }
}
