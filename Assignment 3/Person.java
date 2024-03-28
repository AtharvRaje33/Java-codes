	public class Person {
    private int age;

    public Person(int age) {
        if (age < 0) {
            this.age = 0;
            System.out.println("Age is not valid.");
        } else {
            this.age = age;
        }
    }

    public void yearPasses() {
        age++;
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 20) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public static void main(String[] args) {
      
        Person person1 = new Person(12);
        person1.amIOld();
        person1.yearPasses();
        person1.amIOld();

    }
}
