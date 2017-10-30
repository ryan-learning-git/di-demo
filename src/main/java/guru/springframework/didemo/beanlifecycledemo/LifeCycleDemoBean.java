package guru.springframework.didemo.beanlifecycledemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean(){
        System.out.println("## I'm in the LifeCycleBean Constructor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The LifeCycleBean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The lifecyle bean has had its properties set.");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## The bean factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## bean name is " + s);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("The application context has been set.");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## The Predestroy annotated method has been called");
    }

    //called by CustomBeanPostProcessor
    public void beforeInit(){
        System.out.println("## Before Init - Called by bean post-processor");
    }

    //called by CustomBeanPostProcessor
    public void afterInit(){
        System.out.println("## Before Init - Called by bean post-processor");
    }


}
