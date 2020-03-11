package com.huey.feign;

import com.huey.exception.CouponException;
import com.huey.vo.CommonResponse;
import com.huey.vo.SettlementInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <h1>优惠券结算微服务 Feign 接口定义</h1>
 * @author  huey
 */
@FeignClient(value = "eureka-client-coupon-settlement",
        fallback = SettlementClientHystrix.class)
public interface SettlementClient {

    /**
     * <h2>优惠券规则计算</h2>
     * */
    @RequestMapping(value = "/coupon-settlement/settlement/compute",
            method = RequestMethod.POST)
    CommonResponse<SettlementInfo> computeRule(
            @RequestBody SettlementInfo settlement) throws CouponException;
}
