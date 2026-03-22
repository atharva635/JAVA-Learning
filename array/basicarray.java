 class basicarray {
    public static void main(String[] args) {
        int [] arr = new int[5];
        //0r int [] arr = {2,3,4,5,6};
      
        //int [] arr == declaration of array and arr get in stack memory
        //arr = new int[5] == initialisation in heap memory

        System.out.println(arr[3]);
        // actually it aumatically takes 0 as a integer  
        datatypes.sum(args);

    }
}
class datatypes{
    public static void sum(String[] args) {
        int a=89;
        int b=98;
        System.out.printf("%d",a+b);
    }
}