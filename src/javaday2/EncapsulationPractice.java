package javaday2;

public class EncapsulationPractice {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name= name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		
		String name = "privateName";
		int age = 34;
		
		EncapsulationPractice e = new EncapsulationPractice();
		e.setName(name);
		e.setAge(age);
		
		System.out.println(e.getName()+" "+ e.getAge());

	}
	
}
