package com.peixiao.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.peixiao.springcloud.entities.CommonResult;

/**
 * @author Peixiao Zhao
 * @date 2020/12/22 8:25
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客户自定义,global handlerException----------1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客户自定义2,global handlerException----------2");
    }

}
