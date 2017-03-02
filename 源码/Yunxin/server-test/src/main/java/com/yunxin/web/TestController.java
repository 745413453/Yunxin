package com.yunxin.web;

import com.yunxin.service.CaBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by henryzhou on 17/3/2.
 */

@RestController
public class TestController {

    @Autowired
    private CaBankService caBankService;

    @RequestMapping(value="/test",method= RequestMethod.GET)
    public String test(){
        return caBankService.selectCaBankById().toString();
    }
}
