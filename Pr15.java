class Employee {
    void displayDetails() {
        System.out.println("Employee Name: Reema");
        System.out.println("Department: IT");
    }
}

class Manager extends Employee {
    void displayDetails() {
        System.out.println("Manager Name: Amit");
        System.out.println("Department: IT");
        System.out.println("Team Size: 10");
        System.out.println("Project Name: Banking System");
    }
}

class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();

        System.out.println("Employee Details:");
        e.displayDetails();

        System.out.println("\nManager Details:");
        m.displayDetails();
    }
}

/*output 
Employee Details:
Employee Name: Reema
Department: IT

Manager Details:
Manager Name: Dax
Department: IT
Team Size: 10
Project Name: Banking System */
