package com.example.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mall.product.entity.BrandEntity;
import com.example.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MallProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity=new BrandEntity();
//        插入
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("成功");
//        更新
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("测试测试");
//        brandService.updateById(brandEntity);


//        查询
        List<BrandEntity> list=brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1L));
        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
