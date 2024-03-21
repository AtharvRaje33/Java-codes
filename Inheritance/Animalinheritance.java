class Animal{
	String type="mammal";
	int age;
}

class Dog extends Animal{
	String color="Black";
}

class Labrador extends Dog{
	String name="Tommy";
	
	void display(int age) {
		System.out.println("Type is:"+type+"\nage is:"+age+"\ncolor is:"+color+"\nname is:"+name);
	}

}



public class Animalinheritance {
	public static void main(String[] args) {
		Labrador l1=new Labrador();
		l1.display(12);
	}

}
