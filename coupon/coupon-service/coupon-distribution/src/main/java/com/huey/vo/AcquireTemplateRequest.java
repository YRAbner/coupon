package com.huey.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>获取优惠券请求对象定义</h1>
 * @author huey
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AcquireTemplateRequest {

    /** 用户 id */
    private Long userId;

    /** 优惠券模板信息 */
    private CouponTemplateSDK templateSDK;
}
