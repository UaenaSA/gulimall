package com.uaena.gulimall.coupon.dao;

import com.uaena.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author UaenaSA
 * @email sunlightcs@gmail.com
 * @date 2020-10-29 18:49:07
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
