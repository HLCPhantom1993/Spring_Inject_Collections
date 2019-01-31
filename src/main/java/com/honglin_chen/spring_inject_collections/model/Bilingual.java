package com.honglin_chen.spring_inject_collections.model;

public class Bilingual {
	/* 双语类实例变量 */ 
	private String firstLanguage; 
	private String secondLanguage; 
	
	/* 双语类默认构造函数 */ 
	public Bilingual() {
		
	}
	
	/* 第一种语言getter方法 */ 
	public String getFirstLanguage() {
		return firstLanguage;
	}
 
	/* 第一种语言设置方法 */ 
	public void setFirstLanguage(String firstLanguage) {
		this.firstLanguage = firstLanguage;
	}
 
	public String getSecondLanguage() {
		return secondLanguage;
	}
 
	public void setSecondLanguage(String secondLanguage) {
		this.secondLanguage = secondLanguage;
	}
	
	@Override
	public String toString() {
		return "第一种语言: " + firstLanguage + " , 第二种语言: " + secondLanguage;
	}
}
