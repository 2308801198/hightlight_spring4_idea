package com.wisely.highlight_spring4.chi1.di.aop;

import java.lang.annotation.*;

/**
 * <p>Description: 编写拦截规则的注解</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: 中视数讯</p>
 * <p>Site: www.digi-zones.com</p>
 *
 * @author shengping
 * @version 1.0
 * @date 2017/5/24
 */
//注解本身是没有功能的，就和xml一样，注解和xml都是一种元数据，元数据即解释数据的数据，这就是所谓的配置
//注解的功能来自用这个注解的地方
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
}
