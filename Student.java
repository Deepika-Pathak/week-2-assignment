//Student Grading (Switch Statement) Create a Student class with name and marks. Write a method calculateGrade() that assigns a grade (A, B, C, D, F) based on marks using a switch or if-else ladder. Create 3 students and display their grades.

public class Student {

    String name;
    int marks;
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public void calculateGrade() {
        char grade;
        switch (marks / 10) {
            case 10:  
            case 9:
                grade = 'A';
                break;
            case 8:   
                grade = 'B';
                break;
            case 7:   
                grade = 'C';
                break;
            case 6:   
                grade = 'D';
                break;
            default:   
                grade = 'F';
                break;
        }
        System.out.println("Student: " + name + ", Marks: " + marks + ", Grade: " + grade);
    }
    public static void main(String[] args) {
        
        Student student1 = new Student("Sarala", 92);
        Student student2 = new Student("Dipa", 75);
        Student student3 = new Student("Ishani", 59);
        student1.calculateGrade();
        student2.calculateGrade();
        student3.calculateGrade();
    }
}
