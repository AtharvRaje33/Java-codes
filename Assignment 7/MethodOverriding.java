class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    // Overriding the makeSound method in the superclass
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

public class MethodOverriding {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.makeSound();
	}
}
