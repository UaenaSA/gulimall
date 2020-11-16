package com.uaena.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.uaena.gulimall.product.entity.BrandEntity;
import com.uaena.gulimall.product.service.BrandService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brand_id.forEach((item)->{
            System.out.println(item);
        });
    }

}
