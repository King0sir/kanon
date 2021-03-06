package org.kin.controller;

import org.kin.service.ISavingService;
import org.kin.service.impl.stocks.RemoteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by kinakihiro on 2017/4/13.
 */
@RestController
public class TestController {

    @Resource
    private ISavingService savingService;

    @RequestMapping("/index")
    public String index(){
        return "Kanon is running";
    }

    @RequestMapping("/list")
    public String get(){
        savingService.savingStocks();
        return "ok";
    }
}
