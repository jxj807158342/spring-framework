/*
 * Copyright 2002-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ajie;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyDemo {
	private static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User)context.getBean("user");
		boolean javaConfig = context.containsBeanDefinition("javaConfig");
		int beanDefinitionCount = context.getBeanDefinitionCount();
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for(String str:beanDefinitionNames){
			System.out.println(str);
		}
		System.out.println(javaConfig);
		System.out.println("beanDefinitionCount=="+beanDefinitionCount);
		System.out.println(user.toString());
		String[] beanNamesForType = context.getBeanNamesForType(User.class);
		for(String str:beanNamesForType){
			System.out.println(str);
		}

	}
}
