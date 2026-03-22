public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {98766,3434,89,5,4,3,2,1};
        int target = 3434;
        int k = binarysearchi(arr,target);
        System.out.println(k);
    }
    static int binarysearchi(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;

        boolean isacending = (arr[start]<arr[end]);

        while(start<=end){
        int mid = start + (end-start)/2;

        if(target==arr[mid]){
            return mid;
        }

        if(isacending){
        if(target<arr[mid]){
            end = mid-1;
        }
        else{
            start = mid+1;
        }
       
    }
        else{
         
        if(target>arr[mid]){
            end = mid-1;
        }
        else {
            start = mid+1;
        }
       }

        }
        return -1;
    }
}
