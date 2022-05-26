package com.example.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author fang
 * @email 1187668245@qq.com
 * @date 2022-05-24 08:39:24
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

