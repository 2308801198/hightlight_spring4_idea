package com.wisely.highlight_spring4.chi1.di.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
//1 使用@Configuration注解表明当前类是一个配置类。这意味着这个类里可能有0个或者多个@Bean注解，此处没有使用包扫描，是因为所有的bean都在此类中定义了
//2 使用@bean注解声明当前方法FunctionService的返回值是一个Bean，Bean的名称是方法名
//3 注入FunctionService的bean时候直接调用functionService();
//4 另外一种注入的方式，直接将FunctionSerivce作为参数给useFunctionService()，
// 这也是spring容器提供的几号的功能，在spring容器中，只要容器中存在某个bean，就可以在另外一个bean的声明方法的参数中写入
@Configuration
public class JavaConfig {

    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.serFunctionService(functionService());
        return useFunctionService;
    }
}
