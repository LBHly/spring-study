package com.lbh2.web;

import com.lbh.boot.Service.HelloService;
import org.springframework.boot.CommandLineRunner;

import javax.annotation.Resource;

/**
 * @author 19546
 */
public class TestController implements CommandLineRunner {

    @Resource
    private HelloService helloService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(helloService.hello());
    }
}
