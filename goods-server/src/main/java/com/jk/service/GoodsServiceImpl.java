package com.jk.service;

import com.jk.mapper.GoodsMapper;
import com.jk.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods> queryGoods() {
        return goodsMapper.queryGoods();
    }
}
