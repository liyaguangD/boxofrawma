package com.jk.mapper;

import com.jk.model.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsMapper {

    List<Goods> queryGoods();
}
