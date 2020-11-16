package com.uaena.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uaena.common.utils.PageUtils;
import com.uaena.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author UaenaSA
 * @email sunlightcs@gmail.com
 * @date 2020-10-29 18:49:07
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

