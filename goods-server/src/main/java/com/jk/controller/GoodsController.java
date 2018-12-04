package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.model.Goods;
import com.jk.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@EnableEurekaClient
public class GoodsController {

    @Autowired
    private GoodsService goodsService;


    @RequestMapping("/queryGoods")
    @ResponseBody
    public HashMap<String,Object> queryGoods(Integer start,Integer pageSize){
        HashMap<String,Object>map = goodsService.queryGoods(start,pageSize);

        return map;

    }
}
