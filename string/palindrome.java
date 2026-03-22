public class palindrome {
    public static void main(String[] args) {
        String str = "abchgcba";
        System.out.println(fibbo(str));
    }
    static boolean fibbo(String str){
        if(str.length()==0){
            return true;
        }
        str = str.toLowerCase();
          for (int i=0;i<=str.length()/2;i++){
            char start = str.charAt(i);
            char last = str.charAt(str.length()-1-i);
            if(start != last){
                return false;
            }

          }
          return true;
    }
}
