package com.uaena.gulimall.member.dao;

import com.uaena.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author UaenaSA
 * @email 752102463@qq.com
 * @date 2020-10-29 19:01:07
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
