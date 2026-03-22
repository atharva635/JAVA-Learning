class Hel{
    private final int pi = 10;
    //to not change this pi value use final 
    // private String name = "Atharva";
    //final not allow overing in method
    //final not allow inheritance in class
    //string, wrapper class, Math are final

    public void show(){
        // ++pi;
        //it generate syntax error when u use final ++pi
    System.out.println("pi = " + pi);

}
}
public class finalvarible {
    public static void main(String[] args) {
        Hel n = new Hel();
        n.show();
    }
}
