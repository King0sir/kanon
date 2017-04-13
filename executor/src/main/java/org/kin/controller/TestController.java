package org.kin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kinakihiro on 2017/4/13.
 */
@RestController
public class TestController {

    @RequestMapping("/index")
    public String index(){
        return "Kanon is running";
    }

}
