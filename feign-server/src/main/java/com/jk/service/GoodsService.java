package com.jk.service;


import com.jk.model.Goods;
import feign.Param;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
@FeignClient(value = "service-client-goods")
public interface GoodsService {

    @RequestMapping(value = "/queryGoods",method = RequestMethod.GET)
    HashMap<String, Object> queryGoods(@RequestParam("start") Integer start,@RequestParam("pageSize") Integer pageSize);
}
