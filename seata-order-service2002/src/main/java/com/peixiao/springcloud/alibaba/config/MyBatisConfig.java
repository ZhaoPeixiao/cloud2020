package com.peixiao.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Peixiao Zhao
 * @date 2020-12-25 9:03
 */
@Configuration
@MapperScan("com.peixiao.springcloud.alibaba.dao")
public class MyBatisConfig {
}
