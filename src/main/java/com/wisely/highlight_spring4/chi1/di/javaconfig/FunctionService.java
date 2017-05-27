package com.wisely.highlight_spring4.chi1.di.javaconfig;

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
//此处没有使用@service声明Bean
//使用功能类的Bean
public class FunctionService {
    public String sayHello(String word){
        return "Hello" + word + "!";
    }
}
