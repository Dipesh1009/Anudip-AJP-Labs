// TASK: Create a program to calculate the annual salary of an employee by using inheritance.

package employee;

// Creating class User
class User {

    // class members defining id and name of user
    private int id;
    private String userName;

    // class constructor User() with parameters 
    // which initializes the value of id and userName
    User (int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    // toString() function which defines what to display
    // when object of User class is printed i.e., name and id of user
    public String toString() {
        return "ID: " + this.id + "\nName: " + this.userName;
    }
}

// Creating class Employee, which is inheriting User class
class Employee extends User {
    
    // class members
    private double salary;

    // class Constructor which is firstly calling constructor of
    // parent class user passing name and id.
    // Secondly, initialising the salary value of the Employee
    Employee (int id, String userName, double salary) {
        super(id, userName);
        this.salary = salary;
    }


    // calculateAnnualSalary() function to calculate the salary of 
    // the employee for the whole year
    public double calculateAnnualSalary() {
        return salary*12;
    }


    // toString() function which defines what to display
    // when object of User class is printed i.e. name, id and salary of employee
    // using parent's toString() function
    public String toString () {
        return super.toString() + "\nSalary: " + this.salary;
    }
}

//// Main Class ////
public class EmployeeSalary {

    public static void main(String[] args) {

        // instantiating Employee object e1
        Employee e1 = new Employee(112, "Kartik Kumar", 45000);

        // printing id, name and salary of employee e1
        System.out.println(e1);

        // printing annual salary of employee e1
        System.out.println("Annual Salary: " + e1.calculateAnnualSalary());
    }
    
}


// End of program