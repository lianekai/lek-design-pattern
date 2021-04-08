# 观察者模式
别再面向 for 循环编程了，Spring 自带的观察者模式就很香！
在 JDK 中如何实现观察者模式?
Spring/ Spring Boot 框架中有一套事件监听机制，可以实现观察者模式。
Spring/Spring Boot 框架中内置了许多事件,我们可以自定义发布应用程序事件

### ApplicationEvent
ApplicationEvent（应用程序事件）它是一个抽象类，相当于观察者模式中的观察目标。
ApplicationEvent 继承自 Java 中的 EventObject 事件对象类，Spring 框架中的所有事件都继承自 ApplicationEvent 类，它是所有事件的父类。
ApplicationEvent 主要的核心是类构造器，它可以初始化一个 source 事件关联对象，以便在事件监听器中获取并通知更新。

### ApplicationListener
ApplicationListener（应用程序事件监听器）它是一个接口，相当于观察者模式中的观察者。
ApplicationListener 继承自 Java 中的 EventListener 事件监听接口，ApplicationListener 类中只有一个 onApplicationEvent 方法，
当指定监听的事件被发布后就会被触发执行，可以通过 event 获取事件中的关联对象。

### ApplicationEventPublisher
应用程序事件发布接口，封装了事件发布功能的基础接口。
ApplicationEventPublisher 有一个默认接口方法和接口方法，接口方法需要由具体的子类容器实现。

### ApplicationContext
ApplicationContext 这个类就再熟悉不过了，它是 Spring 框架中的核心容器。
ApplicationContext 接口继承了 ApplicationEventPublisher 接口，所以常用的 ApplicationContext 就可以用来发布事件。

## Spring实现观察者模式总结
Spring 事件监听发布角色串起来就是，通过 ApplicationEventPublisher 或者 ApplicationContext 容器发布  ApplicationEvent 事件并关联事件对象，
然后 ApplicationListener 监听该事件，当事件发布后，监听器就会收执行并获取到事件及关联对象。


## Spring Boot 观察者模式实战
