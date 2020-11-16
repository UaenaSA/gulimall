package com.uaena.gulimall.product.dao;

import com.uaena.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author UaenaSA
 * @email sunlightcs@gmail.com
 * @date 2020-10-29 17:54:12
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
