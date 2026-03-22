abstract class car{
    int tyres = 4;
    void engine(){}
}
class Maruti extends car{
    void engine(){
        System.out.println("Maruti engine");
    }
    public static void main(String[] args) {
        Maruti m1 = new Maruti();
        System.out.println("Tyres are "+m1.tyres);
    }
}
//abstract cannot create obj 
//abstract class have both abstract and both abstract method
//it is mandatory to implement (override) abstract method inside concreate class
//multiple inheritence is not possible inside abstract class 
//the main purpose of abstract class is to set the norms for concreare class
//all we can say abstract class is helping class