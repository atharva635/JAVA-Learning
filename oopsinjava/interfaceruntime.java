//by declaring interface to class java automatically declare that 
//to public, final , and static this is why abstract is diff from interface
//if we declare method in class interface then that method is java will make 
//abstract and public both automatically
//hum interface ka method me body bhi bana scte hai bs usme 
//static and defualt ka use krenge by JAVA 8
//like abstract, interface ka obj bhi ni bna scte
//interface ka child class bna scte hai inheritance using "impliments"

interface Animl{
    void sound();
    abstract public void eat();
}

class elephant implements Animl{
    // @Override
    public void sound(){
        System.out.println("elenp sound balle blle");
    }
    public void eat(){
        System.out.println("grasse and trees");
    }

}

class lion implements Animl{
    // @Override
    public void sound(){
        System.out.println("lion sound balle blle");
    }
    public void eat(){
        System.out.println("flesh");
    }

}
public class interfaceruntime {
    public static void main(String[] args) {
        Animl ani;
        ani = new elephant();
        ani.eat();   
        ani = new lion();
        ani.sound();
    }
}
