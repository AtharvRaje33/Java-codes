// Parent class
class Mall {
    String mallName;

    public Mall(String mallName) {
        this.mallName = mallName;
    }

    
    public void displayMallInfo() {
        System.out.println("Mall Name: " + mallName);
    }
}


class FoodCourt extends Mall {
    private int numFoodStalls;

   
    public FoodCourt(String mallName, int numFoodStalls) {
       
        super(mallName);
        this.numFoodStalls = numFoodStalls;
    }

    public void displayFoodCourtInfo() {

        super.displayMallInfo();
        System.out.println("Number of Food Stalls: " + numFoodStalls);
    }
}


public class MallExample {
    public static void main(String[] args) {
      
        FoodCourt foodCourt = new FoodCourt("City Mall", 10);

        foodCourt.displayFoodCourtInfo();
    }
}
