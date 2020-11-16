package com.uaena.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uaena.common.utils.PageUtils;
import com.uaena.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author UaenaSA
 * @email sunlightcs@gmail.com
 * @date 2020-10-29 18:49:07
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

