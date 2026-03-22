//that initialises a newly created obj of that class
//have same name as that of class
class box{
    private int len,bre,hig;

    public box(int len,int bre,int hig){
        this.len = len;
        this.bre = bre;
        this.hig = hig;
    }
    // public box(int side){
    //     this.len = side;
    //     this.bre = side;
    //     this.hig = side;   
    // }

    //or or or or or

    public box(int side){
        this(side,side,side);
    }
    
    public void show(){
        System.out.println(len + " " + bre + "  " + hig + " ");
    }
}
public class constructor2 {
    public static void main(String[] args) {
        box b1 = new box(34,43,43);
        b1.toString();
        b1.show();
    }
}
