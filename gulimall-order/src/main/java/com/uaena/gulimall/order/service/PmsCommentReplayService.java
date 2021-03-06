package com.uaena.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uaena.common.utils.PageUtils;
import com.uaena.gulimall.order.entity.PmsCommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author UaenaSA
 * @email 752102463@qq.com
 * @date 2020-10-29 19:09:28
 */
public interface PmsCommentReplayService extends IService<PmsCommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

