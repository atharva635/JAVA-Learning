public class infitebinarysearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,17,23,34,35,36,37,38,39,40,41,42,43,44,45,46,56,354};
        int target = 56;
        int k = ans(arr,target);
        System.out.println(k);
    }
    static int ans(int [] arr,int target){
        //for array to take in bunch and then twice to twice of that
        int start = 0;
        int end = 1;
        //condition for find that target

        while(target>arr[end]){
            int newstart = end+1;

            //newend is previous end + twice of size of array
            end = end + (end-start+1)*2;
            start = newstart;
            if (end >= arr.length) {  // Prevent out of bounds
        end = arr.length - 1;
    }
        }
        return binary(arr,target,start,end);
        }

        static int binary(int[] arr, int target,int start,int end){
        // int start = 0;
        // int end = arr.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid +1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
