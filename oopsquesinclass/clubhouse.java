// class Student {
//     String name;
//     int age;

//     void introduce() {
//         System.out.println("My name is " + name + " and my age is " + age);
//     }
// }

// class sthostel extends Student {
//     @Override
//     void introduce() {
//         System.out.println("I am " + name + " from the hostel, and I am " + age + " years old.");
//     }
// }

// // Main class must match filename: clubhouse.java
// public class clubhouse {
//     public static void main(String[] args) {
//         sthostel st = new sthostel(); // object of subclass
//         st.name = "Ajay";
//         st.age = 20;
//         st.introduce(); // calls overridden method
//     }
// }



class Student {
    String name;
    int age;

    // no-arg constructor
    Student() {
        System.out.println("Student default constructor");
    }
}

class sthostel extends Student {
    sthostel() {
        // Java automatically calls super();
        System.out.println("sthostel constructor");
    }
}

public class clubhouse {
    public static void main(String[] args) {
        new sthostel();
    }
}
