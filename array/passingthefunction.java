import java.util.Arrays;
import java.util.Scanner;

public class passingthefunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {1, 2, 4, 6, 56};
        System.out.println(Arrays.toString(arr));
        arr[2] = 55;
        System.out.println(Arrays.toString(arr));
        input.close();

    }
}
