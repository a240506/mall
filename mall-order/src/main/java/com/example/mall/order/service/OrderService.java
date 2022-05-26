package com.example.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author fang
 * @email 1187668245@qq.com
 * @date 2022-05-25 20:13:04
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

