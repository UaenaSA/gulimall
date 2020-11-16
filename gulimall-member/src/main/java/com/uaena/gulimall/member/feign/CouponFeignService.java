package com.uaena.gulimall.member.feign;

import com.uaena.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author UaenaSA
 * @version 1.0
 * @date 2020/10/30 0030 12:49
 * 声明式远程调用
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
