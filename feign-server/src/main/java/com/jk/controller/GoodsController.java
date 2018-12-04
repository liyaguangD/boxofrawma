package com.jk.controller;


import com.alibaba.fastjson.JSONArray;
import com.jk.model.Goods;
import com.jk.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/good")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/queryGoods")
    @ResponseBody
    public String queryGoods(@RequestParam("callback") String callback){
        List<Goods> list=goodsService.queryGoods();
        String a = JSONArray.toJSONString(list);
        String aa= callback+"("+a+")";
        return aa;
    }
}
