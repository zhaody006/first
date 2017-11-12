package HomeWork;

/*
 *  请使用面向对象思想描述Person类（姓名，年龄，住址）
	要求包含成员变量和成员方法，构造方法（无参，满参）
	主方法中匿名调用该成员方法并打印
	演示格式如下：
 

 */
public class Person {
	private String name;
	private int age;
	private String address;
	public Person() {
		
	}
	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void print(){
		System.out.println("学生信息: \n姓名: "+name+"\n年龄: "+age+"\n住址: "+address);
	}
}
