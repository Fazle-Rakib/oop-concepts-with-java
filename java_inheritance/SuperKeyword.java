package java_inheritance;

class RestaurantClass {
    String name;

    RestaurantClass(String name) {
        this.name = name;
    }

    int estimateDeliveryTime() {
        return 40;
    }

    void displayInfo() {
        System.out.println(name + " estimated delivery time: " + estimateDeliveryTime() + " minutes.");
    }
}

class FastFoodRestaurantClass extends RestaurantClass {
    FastFoodRestaurantClass(String name) {
        super(name);
        this.name = "default";
    }

    @Override
    int estimateDeliveryTime() {
        return 20;
    }
}

class FineDiningRestaurantClass extends RestaurantClass {
    FineDiningRestaurantClass(String name) {
        super(name);
    }

    @Override
    int estimateDeliveryTime() {
        return 60;
    }
}

// Main class
public class SuperKeyword {
    public static void main(String[] args) {
        RestaurantClass genericRestaurant = new RestaurantClass("Generic Restaurant");
        FastFoodRestaurantClass fastFood = new FastFoodRestaurantClass("Fast Bites");
        FineDiningRestaurantClass fineDining = new FineDiningRestaurantClass("Luxury Dine");

        genericRestaurant.displayInfo();
        fastFood.displayInfo();
        fineDining.displayInfo();
    }
}
