package com.honglin_chen.spring_inject_collections.controller;

import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.Property;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext; 

import com.honglin_chen.spring_inject_collections.service.CustomerService; 
import com.honglin_chen.spring_inject_collections.model.Customer; 

@RestController
public class WebController {
	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml"); 
	CustomerService customerService = (CustomerService) context.getBean("customerService"); 
	
	@RequestMapping("/set")
	public Set<String> set() {
		return customerService.getServiceSet(); 
	}
	
	@RequestMapping("/list")
	public List<Customer> list() {
		return customerService.getCustomerList(); 
	}
	
	@RequestMapping("/map")
	public Map<Integer, String> map() {
		return customerService.getChannelServiceMap();
	}
	
	@RequestMapping("/property")
	public String property() {
		/* Properties类代表了一个持续的properties集合, 它可以被保存到一个流或者从一个流中加载
		 * 在property中, 每一个键和其对应的值都是一个字符串儿
		 */
		Properties props = customerService.getLanguage(); 
		return props.toString();
	}
 }
