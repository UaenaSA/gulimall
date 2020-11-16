package com.uaena.gulimall.product.dao;

import com.uaena.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author UaenaSA
 * @email sunlightcs@gmail.com
 * @date 2020-10-29 17:54:12
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
