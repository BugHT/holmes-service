package com.wanan.holmes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author teng.hao
 * Created by Intellij IDEA
 * Date 18/1/14
 * Time 上午1:09
 */
@SpringBootApplication
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class,args);
        System.out.print("服务已经启动");
    }
}
