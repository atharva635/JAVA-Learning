import java.util.Scanner;

public class stringsearch {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter the number of String to Print");
        int k = str.nextInt();
        str.nextLine();

        // str.close();

        String[] arr = new String[k];

        System.out.println("Enter the String");
        for (int i=0;i<k;i++){
               arr[i] = str.nextLine();
        }

         System.out.println("Enter the search String");
        String search = str.next();

        int l = searching(arr,search);
        System.out.println(l);
        str.close();
    }
        static int searching(String [] arr,String search){
            if(arr.length==0){
                return -1;
            }
            for (int i=0;i<arr.length;i++){
                if(arr[i].equals(search)){
                    return i;
                }
            }
            return -1;

        }
}
