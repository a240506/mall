package com.example.mall.ware.dao;

import com.example.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author fang
 * @email 1187668245@qq.com
 * @date 2022-05-25 20:20:44
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
