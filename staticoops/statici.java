class Student {
    int rollNumber;                 // instance variable
    static String college = "KIET"; // static variable (shared by all)
}

public class statici {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.rollNumber = 101;
        s2.rollNumber = 102;

        // Instance: different for each object
        System.out.println("S1 roll: " + s1.rollNumber); // 101
        System.out.println("S2 roll: " + s2.rollNumber); // 102

        // Static: should be accessed via class name
        System.out.println("College (via class): " + Student.college); // KIET

        // Changing static variable
        Student.college = "IIT Delhi";

        System.out.println("S1 college after change: " + Student.college); // IIT Delhi
        System.out.println("S2 college after change: " + Student.college); //
    }
}
