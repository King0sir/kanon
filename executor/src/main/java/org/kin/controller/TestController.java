package org.kin.controller;

import org.kin.service.stocks.RemoteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by kinakihiro on 2017/4/13.
 */
@RestController
public class TestController {

    @Resource
    private RemoteService remoteService;

    @RequestMapping("/index")
    public String index(){
        return "Kanon is running";
    }

    @RequestMapping("/list")
    public String get(){
        remoteService.getStockList();
        return "ok";
    }
}
