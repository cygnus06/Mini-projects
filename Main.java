// Base class: Student lab6 q2
class Student {
    private int regNumber;
    private String name;
    private int age;

    // Constructor for Student
    public Student(int regNumber, String name, int age) {
        this.regNumber = regNumber;
        this.name = name;
        this.age = age;
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class: UGStudent
class UGStudent extends Student {
    private int semester;
    private double fees;

    // Constructor for UGStudent
    public UGStudent(int regNumber, String name, int age, int semester, double fees) {
        super(regNumber, name, age);
        this.semester = semester;
        this.fees = fees;
    }

    // Display UG student details
    public void displayUGDetails() {
        System.out.println("UG Student Details:");
        displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: $" + fees);
    }
}

// Derived class: PGStudent
class PGStudent extends Student {
    private int semester;
    private double fees;

    // Constructor for PGStudent
    public PGStudent(int regNumber, String name, int age, int semester, double fees) {
        super(regNumber, name, age);
        this.semester = semester;
        this.fees = fees;
    }

    // Display PG student details
    public void displayPGDetails() {
        System.out.println("PG Student Details:");
        displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: $" + fees);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create UG students
        UGStudent ug1 = new UGStudent(101, "John", 20, 2, 1500.0);
        UGStudent ug2 = new UGStudent(102, "Alice", 21, 3, 1600.0);

        // Create PG students
        PGStudent pg1 = new PGStudent(201, "Bob", 24, 1, 2500.0);
        PGStudent pg2 = new PGStudent(202, "Eve", 23, 2, 2700.0);

        // Display UG student details
        ug1.displayUGDetails();
        ug2.displayUGDetails();

        // Display PG student details
        pg1.displayPGDetails();
        pg2.displayPGDetails();
    }
}
