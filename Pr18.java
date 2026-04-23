abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {
    String fuelType() {
        return "Petrol/Diesel";
    }

    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {
    String fuelType() {
        return "Petrol";
    }

    int noOfWheels() {
        return 2;
    }
}

class Main {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        System.out.println("Car Details");
        System.out.println("Fuel Type: " + c.fuelType());
        System.out.println("Number of Wheels: " + c.noOfWheels());

        System.out.println("\nBike Details");
        System.out.println("Fuel Type: " + b.fuelType());
        System.out.println("Number of Wheels: " + b.noOfWheels());
    }
}

/*output 
Car Details
Fuel Type: Petrol/Diesel
Number of Wheels: 4

Bike Details
Fuel Type: Petrol
Number of Wheels: 2 */
