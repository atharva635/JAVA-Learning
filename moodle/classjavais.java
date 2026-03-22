

class classjava {

    String name;
    int age;
    String salary;


classjava(String name,int age,String salary){
    this.name= name;
    this.age = age;
    this.salary = salary;

}
void display(){
    System.out.println("name" + name + "age" + age +"salary" + salary) ;
}
}
public class classjavais{
    public static void main(String[] args) {
        // Creating objects using constructor
        classjava s1 = new classjava("Atharva ,", 20, "Computer Science");
        classjava s2 = new classjava("Riya", 19, "Electronics");
        classjava s3 = new classjava("Aman", 21, "Mechanical");

        // Display details
        s1.display();
        s2.display();
        s3.display();
    }
}