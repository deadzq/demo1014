package com.example.demo1014.router;

import com.example.demo1014.handler.CityHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * RouterFunctions对请求路由处理类,即将请求路由到处理器.这里将一个GET请求/hello
 * 路由到处理器cityHandler的helloCity方法上.跟SpringMVC模式下的HandleMapping的作用类似.
 * RouterFunctions.route(RequestPredicate,HandlerFunction)方法,对应的入参是请求参数
 * 和处理函数,如果请求匹配,就调用对应的处理器函数.
 */
@Configuration
public class CityRouter {
    @Bean
    public RouterFunction<ServerResponse> routeCity(CityHandler cityHandler){
        return RouterFunctions
                .route(RequestPredicates.GET("/hello")
                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                        cityHandler::helloCity);
    }
}
