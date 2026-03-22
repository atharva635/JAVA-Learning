public class search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int search = 7;
        int k = linear(arr,search);
        System.out.println(k);

    }
    static int linear(int[] arr, int search){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(search==arr[i]){
                return arr[i];
            }
        }
        return -1;

    }
}
