package com.wisely.highlight_spring4.chi1.di.aop;

import org.springframework.stereotype.Service;

/**
 * <p>Description: 编写使用注解的被拦截类</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: 中视数讯</p>
 * <p>Site: www.digi-zones.com</p>
 *
 * @author shengping
 * @version 1.0
 * @date 2017/5/24
 */

@Service
public class DemoAnnotationService {

    @Action(name="注解式拦截的add操作")
    public void add(){

    }
}
