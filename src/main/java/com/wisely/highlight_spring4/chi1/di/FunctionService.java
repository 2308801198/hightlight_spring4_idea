package com.wisely.highlight_spring4.chi1.di;

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
//使用@service注解声明当前FunctionSerice类是spring管理的一个Bean。
//其中，使用@Component、@service、@responsitory和@controller是等效的，可根据需要选择
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + "!";
    }

}
