package com.honglin_chen.spring_inject_collections.service;

import java.util.*;
import com.honglin_chen.spring_inject_collections.model.Customer; 

public class CustomerService {
	/* 客户服务类定义集合实例变量, 通过bean构造文件xml注入集合数据 */ 
	List<Customer> customerList; /* 客户列表包括所有客户object */ 
	Set<String> serviceSet; /* 服务集合包括所有提供的服务 */ 
	Map<Integer, String> channelServiceMap; /* 建立服务编号与服务名称的映射 */ 
	Properties language; /* 为bean建立语言属性包括所有语言 */ 
	
	/* 得到一个服务集合包括所有服务的名字 */
	public Set<String> getServiceSet() {
		return serviceSet;
	}

	/* 设置一个服务集合包含所有服务名字 */
	public void setServiceSet(Set<String> serviceSet) {
		this.serviceSet = serviceSet;
	}
 
	public Map<Integer, String> getChannelServiceMap() {
		return channelServiceMap;
	}
 
	public void setChannelServiceMap(Map<Integer, String> channelServiceMap) {
		this.channelServiceMap = channelServiceMap;
	}
 
	public List<Customer> getCustomerList() {
		return customerList;
	}
 
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
 
	public Properties getLanguage() {
		return language;
	}
 
	public void setLanguage(Properties language) {
		this.language = language;
	}
 }
