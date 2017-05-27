package com.wisely.highlight_spring4.chi1.di;

import org.springframework.context.annotation.ComponentScan;
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
//1.@Configuration声明当前类是一个配置类，后有细说，不赘述
//2 使用@ComponentScan自动扫描包名下所有@service、@component、@repository和@Controller的类，并注册为Bean

@Configuration
@ComponentScan("com.wisely.highlight_spring4.chi1.di")
public class DiConfig {
}
