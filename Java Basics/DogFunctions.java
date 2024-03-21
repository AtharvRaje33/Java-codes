class Dog{
	private int age;
	private String name; 
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void dogBarks() {
		System.out.println(this.name + " is barking");
	}
	
	
}



public class DogFunctions {
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println("Before Getter and Setter");
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		dog.setAge(4);
		dog.setName("Tommy");
		
		System.out.println("After getter and setter");
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		dog.dogBarks();
		
		
		
		
	}
}
