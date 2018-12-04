package com.jk.service;

import com.jk.model.Goods;

import java.util.HashMap;
import java.util.List;

public interface GoodsService {
    HashMap<String, Object> queryGoods(Integer start, Integer pageSize);
}
