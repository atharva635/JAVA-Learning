class studen{
    int roll;
    String name;
}
public class classobj{
    public static void main(String[] args) {
        studen s = new studen();
        s.name="Atharva";
        s.roll = 46;

        studen t = new studen();
        t.name="Athara";
        t.roll = 463;

        studen u = new studen();
        u.name="Atharv";
        u.roll = 4634;

        studen v = new studen();
        v.name="Athava";
        v.roll = 443;


        System.out.println("name = " + s.name + s.roll);
        System.out.println("name = " + t.name + t.roll);
        System.out.println("name = " + u.name + u.roll);
        System.out.println("name = " + v.name + v.roll);
         
    }
}