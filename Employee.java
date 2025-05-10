//Employee Bonus Calculation Create a class Employee with name, salary, and yearsOfExperience. Write a method calculateBonus():If experience > 5 years, bonus = 20% of salary.Otherwise, bonus = 10% of salary Display the bonus amount for each employee.

public class Employee {
    
    String name;
    double salary;
    int yearsOfExperience;

    public Employee(String name, double salary, int yearsOfExperience) {
        this.name = name;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void calculateBonus() {
        double bonus;
        if (yearsOfExperience > 5) {
            bonus = salary * 0.20;  
        } else {
            bonus = salary * 0.10;  
        }
        System.out.println("Employee: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Bonus: $" + bonus);
        System.out.println();
    }
    public static void main(String[] args) {
        
        Employee employee1 = new Employee("John Doe", 50000, 6);
        Employee employee2 = new Employee("Jane Smith", 45000, 3);
        Employee employee3 = new Employee("Alice Johnson", 60000, 7);

        employee1.calculateBonus();
        employee2.calculateBonus();
        employee3.calculateBonus();
    }
}

