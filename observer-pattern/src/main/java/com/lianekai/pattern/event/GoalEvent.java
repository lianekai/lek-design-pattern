package com.lianekai.pattern.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * 观察者目标 继承ApplicationEvent
 *
 * @author lianekai
 * @version: 1.0
 * @date 2021/04/09 00:20
 */
@Getter
public class GoalEvent extends ApplicationEvent {
    public GoalEvent(Object source) {
        super(source);
    }
}
