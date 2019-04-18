package com.youzan.open.gen.web.controller;

import com.youzan.open.gen.core.Generator;
import com.youzan.open.gen.core.GeneratorManager;
import com.youzan.open.gen.model.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ph0ly
 * @time 2016-11-30
 */
@RestController
@RequestMapping("/web")
public class GeneratorController {

    @Autowired
    private GeneratorManager manager;

    @RequestMapping(value = "/gen", method = RequestMethod.GET)
    public ResultModel generate() {
        manager.execute();
        return new ResultModel();
    }

}
