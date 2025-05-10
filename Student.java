//Simple Class with a Method Create a class Student with two attributes: name and age. Create a method displayInfo() that prints the student's name and age. In the main method, create a Student object and call displayInfo().

public class Student {
    String name;
    int age;
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Sarala";
        s1.age = 20;

        s1.displayInfo();
    }
}
