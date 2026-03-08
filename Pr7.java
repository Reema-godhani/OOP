import java.util.*;

class Employee
{
    private String employeeName;
    private double employeeSalary;

    
    public void readEmployeeData()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter employee salary: ");
        employeeSalary = sc.nextDouble();
    }

    
    public void displayEmployeeData()
    {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }

    public static void main(String args[])
    {
        Employee e1 = new Employee();   

        e1.readEmployeeData();          
        e1.displayEmployeeData();       
    }
}

/* output 
Enter employee name: Riya
Enter employee salary: 25000
Employee Name: Riya
Employee Salary: 25000.0 */
