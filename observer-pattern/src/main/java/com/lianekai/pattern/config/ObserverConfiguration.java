package com.lianekai.pattern.config;

import com.lianekai.pattern.listener.EventListener;
import com.lianekai.pattern.event.GoalEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 *
 * @author lianekai
 * @version: 1.0
 * @date 2021/04/09 00:32
 */
@Slf4j
@Configuration
public class ObserverConfiguration {
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context){
        return (args -> {
            log.info("发布事件：什么是观察者模式");
            context.publishEvent(new GoalEvent("小楷"));
        });
    }
    @Bean
    public EventListener eventListener1(){
        return new EventListener("小明");
    }
    @Bean
    public EventListener eventListener2(){
        return new EventListener("小红");
    }
    @Bean
    public EventListener eventListener3(){
        return new EventListener("小爱");
    }
}
