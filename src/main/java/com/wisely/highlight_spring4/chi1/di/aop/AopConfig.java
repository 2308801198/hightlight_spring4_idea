package com.wisely.highlight_spring4.chi1.di.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <p>Description:配置类</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: 中视数讯</p>
 * <p>Site: www.digi-zones.com</p>
 *
 * @author shengping
 * @version 1.0
 * @date 2017/5/24
 */

//使用@enableaspectjautoproxy注解开启spring对aspectj代理的支持
@Configuration
@ComponentScan("com.wisely.highlight_spring4.chi1.di.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
