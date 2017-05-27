package com.wisely.highlight_spring4.chi1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>Description:</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: 中视数讯</p>
 * <p>Site: www.digi-zones.com</p>
 *
 * @author shengping
 * @version 1.0
 * @date 2017/5/22
 */
//使用AnnotationConfigApplicationContext作为spirng容器，接受输入一个配置类作为参数
//获得声明配置的UserFunctionService的Bean
public class Main {
    public static void main(String [] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UserFunctionService userFunctionService = context.getBean(UserFunctionService.class);
        System.out.println(userFunctionService.SayHello("Aping"));

        context.close();
    }
}
