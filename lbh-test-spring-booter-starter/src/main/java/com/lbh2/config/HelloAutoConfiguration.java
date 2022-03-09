package com.lbh2.config;

import com.lbh.boot.Service.HelloService;
import com.lbh.boot.properties.Helloproperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration(proxyBeanMethods = false)
@ConditionalOnClass(value = {HelloService.class})
@EnableConfigurationProperties(value = Helloproperties.class)
@ConditionalOnWebApplication
@ConditionalOnProperty(prefix = "lbh.config",name = "flag",havingValue = "true",matchIfMissing = true)
public class HelloAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService(Helloproperties helloproperties) {
        HelloService helloService = new HelloService();
        helloproperties.setName(helloproperties.getName());
        helloproperties.setAge(helloproperties.getAge());
        return helloService;
    }

}
