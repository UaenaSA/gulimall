package com.uaena.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uaena.common.utils.PageUtils;
import com.uaena.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author UaenaSA
 * @email sunlightcs@gmail.com
 * @date 2020-10-29 18:49:08
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

