package com.jk.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jk.model.Goods;
import com.jk.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/good")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/queryGoods")
    @ResponseBody
    public String queryGoods(@RequestParam("callback") String callback, Integer start, Integer pageSize){
        HashMap<String,Object> map = goodsService.queryGoods(start,pageSize);


        String jsonString = JSONObject.toJSONString(map);
        String aa= callback+"("+jsonString+")";
        return aa;
    }
}
