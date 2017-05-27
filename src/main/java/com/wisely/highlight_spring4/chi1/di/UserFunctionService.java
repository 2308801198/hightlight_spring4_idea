package com.wisely.highlight_spring4.chi1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
//1 使用@service注解声明当前UserFunctionService类是spring管理的一个Bean
//2 使用@Autowired将FunctionService的实体bean注入到UserFunctionService中，让UserFunctionService具备FunctionSerice的能力。
    //此处使用JSR-330的@Lnject注解或者JSR-250的@Resource注解是等效的

@Service
public class UserFunctionService {

    @Autowired
    FunctionService functionService;

    public String SayHello(String word){
        return functionService.sayHello(word);
    }

}
