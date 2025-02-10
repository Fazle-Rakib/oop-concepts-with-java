package java_inheritance;

class Restaurant {
    String name;

    Restaurant(String name) {
        this.name = name;
    }
    int estimateDeliveryTime() {
        return 40;
    }
    void displayInfo() {
        System.out.println(this.name + " estimated delivery time: " + estimateDeliveryTime() + " minutes.");
    }
}

class FastFoodRestaurant extends Restaurant {
    FastFoodRestaurant(String name) {
//        this.name = name;
        super(name);
    }

    @Override
    int estimateDeliveryTime() {
        return 20;
    }
}

class FineDiningRestaurant extends Restaurant {
    FineDiningRestaurant(String name) {
        super(name);
    }
    @Override
    int estimateDeliveryTime() {
        return 60;
    }
}

// Main class
public class MethodOverriding {
    public static void main(String[] args) {
        Restaurant genericRestaurant = new Restaurant("Normal");
        FastFoodRestaurant fastFood = new FastFoodRestaurant("Fast-food");
        FineDiningRestaurant fineDining = new FineDiningRestaurant("Luxury-food");

        genericRestaurant.displayInfo();
        fastFood.displayInfo();
        fineDining.displayInfo();
    }
}
