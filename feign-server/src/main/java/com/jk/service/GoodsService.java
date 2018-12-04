package com.jk.service;


import com.jk.model.Goods;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@FeignClient(value = "service-client-goods")
public interface GoodsService {

    @RequestMapping(value = "/queryGoods",method = RequestMethod.GET)
    List<Goods> queryGoods();
}
