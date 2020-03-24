package com.feri.job.consumer.config;

import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: WashCar
 * @description: 解决超时 延长时间
 * @author: Feri
 * @create: 2019-11-07 12:00
 */
@Configuration
public class FeignConfig {
    public int connectTime=100000;
    public int readTime=100000;
    @Bean
    public Request.Options createOP(){
        return new Request.Options(connectTime,readTime);
    }
    //Feign 的重试次数 默认重试5次
    @Bean
    public Retryer createR(){
        return new Retryer.Default(50,100,3);
    }
}
