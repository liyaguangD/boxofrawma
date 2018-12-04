package com.jk.service;

import com.jk.mapper.GoodsMapper;
import com.jk.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;


    @Override
    public HashMap<String, Object> queryGoods(Integer start, Integer pageSize)
    {
        HashMap<String, Object> map = new HashMap<>();
        List<Goods>list = goodsMapper.queryGoods(start,pageSize);
        long count = goodsMapper.queryCountGood();
        map.put("total",count);
        map.put("rows",list);
        return map;
    }
}
