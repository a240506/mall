package com.example.mall.product.dao;

import com.example.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author fang
 * @email 1187668245@qq.com
 * @date 2022-05-24 08:39:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
