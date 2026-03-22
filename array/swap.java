// import java.util.*;
// public class swap {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
//         Collections.swap(list,3,5);
//         System.out.println(list);
//     }
// }



import java.util.*;
public class swap{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,56,6};
        swaps(arr,3,5);
        System.out.println(Arrays.toString(arr));
    }
    static void swaps(int[] arr,int index1,int index2 ){
        int temp = arr[index1];
        arr[index1] = arr [index2];
        arr[index2] = temp;

    }
}