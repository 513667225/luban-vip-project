package com.modules.order.feginService;

import com.modules.order.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 需要咨询java高级VIP课程的同学可以加安其拉老师的QQ：3164703201
 * 需要视频资料的可以添加妮可老师的QQ：2860884084
 * author：鲁班学院-商鞅老师
 */
@FeignClient("server-product")
public interface ProductServiceClient {

    @RequestMapping("/getProductByid")
    public R getProduct(@RequestParam("id") String id);

    @RequestMapping("/updateStock")
    public R updateInventory(@RequestParam("productId") String productId,@RequestParam("stock") int stock);


}
