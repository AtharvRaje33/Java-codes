class Box {
    double width;
    double height;
    double depth;

 
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

   
    double volume() {
        return width * height * depth;
    }
}


class BoxWeight extends Box {
    double weight;

    
    BoxWeight(double w, double h, double d, double weight) {
        super(w, h, d); 
        this.weight = weight;
    }
}


class ShipmentCost extends BoxWeight {
    double cost; 

   
    ShipmentCost(double w, double h, double d, double weight, double cost) {
        super(w, h, d, weight); 
        this.cost = cost;
    }
}


public class Shipment {
    public static void main(String[] args) {
        ShipmentCost shipment = new ShipmentCost(10, 5, 3, 2.5, 50);

        double volume = shipment.volume();
        double weight = shipment.weight;
        double cost = shipment.cost;

        // Displaying the results
        System.out.println("Volume: " + volume);
        System.out.println("Weight: " + weight);
        System.out.println("Cost: $" + cost);
    }
}


