package com.example.demo1014.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * ServerResponse是对响应的封装,可以设置响应状态,响应头,响应正文.
 * ok代表200响应码,MediaType枚举是代表这文本内容类型,返回String的对象.
 * Mono做为返回对象,是因为返回包含了一个ServerResponse对象,而不是多个元素.
 */
@Component
public class CityHandler {
    public Mono<ServerResponse> helloCity(ServerRequest request){
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("Hello , City !"));
    }

    public Mono<String> sayHelloWorld() {
        return Mono.just("Hello World");
    }

}
