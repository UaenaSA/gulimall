package com.uaena.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uaena.common.utils.PageUtils;
import com.uaena.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author UaenaSA
 * @email sunlightcs@gmail.com
 * @date 2020-10-29 17:54:12
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

