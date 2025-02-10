package java_inheritance;

class Restaurant {
    int estimateDeliveryTime() {
        return 40;
    }
    void displayInfo(String name) {
        System.out.println(name + " estimated delivery time: " + estimateDeliveryTime() + " minutes.");
    }
}

class FastFoodRestaurant extends Restaurant {
    @Override
    int estimateDeliveryTime() {
        return 20;
    }
}

class FineDiningRestaurant extends Restaurant {
    @Override
    int estimateDeliveryTime() {
        return 60;
    }
}

// Main class
public class MethodOverriding {
    public static void main(String[] args) {
        Restaurant genericRestaurant = new Restaurant();
        FastFoodRestaurant fastFood = new FastFoodRestaurant();
        FineDiningRestaurant fineDining = new FineDiningRestaurant();

        genericRestaurant.displayInfo("Normal");
        fastFood.displayInfo("Fast-food");
        fineDining.displayInfo("Luxury-food");
    }
}
