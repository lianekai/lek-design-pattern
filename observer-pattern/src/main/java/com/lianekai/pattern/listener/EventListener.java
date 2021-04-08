package com.lianekai.pattern.listener;

import com.lianekai.pattern.event.GoalEvent;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;

/**
 * 新增观察者类 实现 Spring 框架中的 ApplicationListener 应用监听接口，相当于是观察者。
 *
 * @author lianekai
 * @version: 1.0
 * @date 2021/04/09 00:22
 */
@Slf4j
@RequiredArgsConstructor
public class EventListener implements ApplicationListener<GoalEvent> {
    /**观察者的名字*/
    @NonNull
    private String observerName;
    /**目标名字*/
    private String goalName;

    @Async
    @Override
    public void onApplicationEvent(GoalEvent goalEvent) {
        goalSpeaking(goalEvent);
    }

    private void goalSpeaking(GoalEvent event){
        this.goalName=(String)event.getSource();
        log.info("观察者："+this.observerName+"正在观察"+goalName+"正在说话~~~");
    }
}
