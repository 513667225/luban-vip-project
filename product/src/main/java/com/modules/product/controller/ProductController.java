package com.modules.product.controller;


import com.modules.product.service.IProductService;
import com.modules.product.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2019-05-23
 */
@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired
    IProductService service;

    @RequestMapping("/getProduct")
    public R getProduct(@RequestParam Map<String,Object> map){

        return service.gerProduct(map);
    }


    @RequestMapping("/updateStock")
    public R updateStock(@RequestParam Map<String,Object> map) throws Exception{
            return service.updateStock(map);

    }
}
