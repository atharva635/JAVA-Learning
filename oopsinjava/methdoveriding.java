class fruit{
    public void taste(){
        System.out.println(" are sweet");
    }
}
class grapes extends fruit{
    // @Override
    public void taste(){
        super.taste(); //it calls also to parent 
        // taste();  //it runs infinitly
        System.out.println("Grapes are citrus");
    }
    
}
public class methdoveriding {
    public static void main(String[] args) {
     grapes h = new grapes();
         h.toString();
         h.taste();
}
}


