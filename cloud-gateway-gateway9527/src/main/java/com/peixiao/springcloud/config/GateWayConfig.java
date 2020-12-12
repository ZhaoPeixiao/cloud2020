package com.peixiao.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author Peixiao Zhao
 * @date 2020/12/12 20:07
 */
@Component
public class GateWayConfig {

    @Bean
    public RouteLocator customerRoutes(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes = builder.routes();
//        http://news.baidu.com/guonei
        routes.route("pathRoutePeixiao",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();

        return routes.build();
    }
}
