public class ceilingbybinary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,94,965,54343};
        int target  = 94;
        int k = ceiling(arr,target);
        System.out.println(k);
    }
    static int ceiling(int[] arr, int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length;
     
        while(start<=end){
        int mid = start + (end-start)/2;
        if(arr[mid]==target){
            return target;
        }
        else if(arr[mid]<target){
            start = mid +1;
        }
        else{
            end = mid-1;
        }
        }
        return arr[start];  
    } 
}
//for floor of the number just return arr[end]