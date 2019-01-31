package com.honglin_chen.spring_inject_collections.model;

public class Customer {
	/* 客户实例private变量 */ 
	private long id; 
	private String firstName; 
	private String lastName; 
	
	/* 客户类默认构造函数 */ 
	public Customer() {
	
	}
	
	/* 自定义客户类构造函数 */ 
	public Customer(long id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/* 得到客户id */ 
	/* 注意:
	 * 根据bean的命名传统, 当bean在构造类时会根据类的实例变量来寻找其对应的
	 * setter和getter方法, 当我们在xml构造一个bean时其property的name属
	 * 性会绑定到实例变量, value会被默认通过setter方法设置. 如果实例变量为
	 * id, 那么在bean构造时会找函数头为setId的setter函数, 如果自定义为其它
	 * 函数头比如setCustomerId会报错
	 */
	public long getId() {
		return id; 
	}
	
	/* 设置客户id */ 
	public void setId(long id) {
		this.id = id; 
	}
	
	/* 客户名字getter方法 */ 
	public String getFirstName() {
		return firstName;
	}
 
	/* 客户名字setter方法 */ 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
 
	/* 客户姓氏getter方法 */ 
	public String getLastName() {
		return lastName;
	}
 
	/* 客户姓氏setter方法 */ 
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
