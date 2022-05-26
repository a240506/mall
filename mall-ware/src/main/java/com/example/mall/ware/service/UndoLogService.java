package com.example.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author fang
 * @email 1187668245@qq.com
 * @date 2022-05-25 20:20:44
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

