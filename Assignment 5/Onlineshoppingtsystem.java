class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Product: " + name + "\nPrice: $" + price);
    }
}

class Electronics extends Product {
    String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
    }
}

class Clothing extends Product {
    String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Size:" + size);
    }
}

class Books extends Product {
    String author;

    public Books(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author:" + author);
    }
}

public class Onlineshoppingtsystem {
    public static void main(String[] args) {
        Electronics electronicsProduct = new Electronics("phone", 12000, "Samsung");
        Clothing clothingProduct = new Clothing("T-Shirt", 600, "Medium");
        Books bookProduct = new Books("Java guide", 1200, "jhonny bravo");

        System.out.println("Electronics Product:");
        electronicsProduct.displayInfo();

        System.out.println("\nClothing Product:");
        clothingProduct.displayInfo();

        System.out.println("\nBook Product:");
        bookProduct.displayInfo();
    }
}
