package com.jk.controller;

import com.jk.model.Goods;
import com.jk.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@EnableEurekaClient
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/queryGoods")
    @ResponseBody
    public List<Goods> queryGoods(){
        List<Goods> list = goodsService.queryGoods();
        return list;
    }
}
