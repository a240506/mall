package com.example.mall.order.dao;

import com.example.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author fang
 * @email 1187668245@qq.com
 * @date 2022-05-25 20:13:04
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
