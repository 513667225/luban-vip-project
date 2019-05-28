package com.modules.admin.feginService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 需要咨询java高级VIP课程的同学可以加白浅老师的QQ：2207192173
 * 需要视频资料的可以添加妮可老师的QQ：2860884084
 * author：鲁班学院-商鞅老师
 */
@FeignClient("server-product")
public interface ProductServiceClient {



}
