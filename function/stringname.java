import java.util.Scanner;

public class stringname {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.next();
        String personal = greet(name);
        System.out.println(personal);
        input.close();

    }
    static String greet(String name){
        String message = "hello " + name;
        return message;

    }

}
