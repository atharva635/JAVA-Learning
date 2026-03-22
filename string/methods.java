import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String name ="     Atharva Gupta is good boy";
        System.out.println(name);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println((name).strip());
        System.out.println(name.indexOf('G'));
    }
}
