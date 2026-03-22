// import java.util.*;
public class abcd {
    public static void main(String[] args) {
        StringBuilder k = new StringBuilder();
        for (int i=0;i<30;i++){
            char ch = ((char)('a' + i));
            k.append(ch);

        }
        k.deleteCharAt(3);
        System.out.println(k.toString());
    }
}

// Stringbuilder is mutable means it can change we can change 
