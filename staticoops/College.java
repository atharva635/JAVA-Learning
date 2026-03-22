public class College {
    static String collegeName = "KIET";
    int rollno;
    String name;

    // Constructor with rollno and name
    College(String name, int rollno) {
        this.rollno = rollno;
        this.name = name;
    }

    public static void main(String[] args) {
        College s1 = new College("Roshan", 1);
        System.out.println("1st student: " + s1.name + ", Roll No: " + s1.rollno);

        College s2 = new College("Ankita", 3);
        System.out.println("2nd student: " + s2.name + ", Roll No: " + s2.rollno);

        College s3 = new College("Ankit", 5);
        System.out.println("3rd student: " + s3.name + ", Roll No: " + s3.rollno);
    }
}
