package com.jk.mapper;

import com.jk.model.Goods;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsMapper {


    Long queryCountGood();

    List<Goods> queryGoods(@Param("start") Integer start,@Param("pageSize") Integer pageSize);
}
