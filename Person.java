package HomeWork;

/*
 *  ��ʹ���������˼������Person�ࣨ���������䣬סַ��
	Ҫ�������Ա�����ͳ�Ա���������췽�����޲Σ����Σ�
	���������������øó�Ա��������ӡ
	��ʾ��ʽ���£�
 

 */
public class Person {
	private String name;
	private int age;
	private String address;
	private String mwj;
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
		System.out.println("ѧ����Ϣ: \n����: "+name+"\n����: "+age+"\nסַ: "+address);
	}
}
