package com.example.mall.coupon.dao;

import com.example.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author fang
 * @email 1187668245@qq.com
 * @date 2022-05-25 19:35:15
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
