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
//1.此处没有使用@service声明bean 2 此处没有使用@autowired注解注入bean
public class UseFunctionService {
    FunctionService functionService;

    public void serFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }
    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
