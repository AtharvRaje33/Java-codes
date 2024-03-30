class Beverage {
    public void prepare() {
        System.out.println("Preparing the base beverage");
    }

    public void serve() {
        System.out.println("Serving the base beverage");
    }
}

class Coffee extends Beverage {
    public void prepare() {
        System.out.println("Brewing coffee");
    }

    public void serve() {
        System.out.println("Serving coffee in a mug");
    }
}

class Tea extends Beverage {
    public void prepare() {
        System.out.println("Steeping tea leaves");
    }

    public void serve() {
        System.out.println("Serving tea in a teacup");
    }
}

class Smoothie extends Beverage {
    public void prepare() {
        System.out.println("Blending fruits and yogurt");
    }

    public void serve() {
        System.out.println("Serving smoothie in a glass");
    }
}

public class Bvapp {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        Smoothie smoothie = new Smoothie();

        System.out.println("Preparing and serving Coffee:");
        coffee.prepare();
        coffee.serve();

        System.out.println("\nPreparing and serving Tea:");
        tea.prepare();
        tea.serve();

        System.out.println("\nPreparing and serving Smoothie:");
        smoothie.prepare();
        smoothie.serve();
    }
}
