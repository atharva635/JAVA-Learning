public class palindrom {
    public static void main(String[] args) {
        String str = " abcba ";
       
        if(palin(str)){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    static boolean palin(String str){
        
        for(int i=0;i<str.length()/2;i++){
              char start = str.charAt(i);
              char last = str.charAt(str.length()-i-1);
              if(start != last){
                 return false;
              }
        }
        return true;
    }
}
