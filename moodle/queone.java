import java.util.*;

public class queone {
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("first number : ");
        int k = n.nextInt();
        System.out.println("Second number : ");
        int l = n.nextInt();
        System.out.println("Third number : ");
        int m = n.nextInt();

        if(k>l && k>m){
            System.out.println(k + " is greater");

        }
        if(l>k && l>m){
            System.out.println(l + " is greater");

        }
        if(m>k && m>l){
            System.out.println(m + " is greater");

        }
        n.close();
    }
}





Server started at http://localhost:8000/student

GET Student: No Student
POST Student Created: Atharva Gupta
GET Student: Atharva Gupta
PUT Student Updated: Atharva Gupta
GET Student: Atharva Gupta
DELETE Student Removed
GET Student: No Student
