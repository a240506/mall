package com.example.mall.member.dao;

import com.example.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author fang
 * @email 1187668245@qq.com
 * @date 2022-05-25 19:58:51
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
