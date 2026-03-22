// import java.util.*;
// public class collection{
// public static void main(String args[]){
// PriorityQueue<String> queue=new PriorityQueue<String>();
// queue.add("Amit Sharma");
// queue.add("Vijay Raj");
// queue.add("JaiShankar");
// queue.add("Raj");
// System.out.println("head:"+queue.element());
// System.out.println("head:"+queue.peek());
// System.out.println("iterating the queue elements:");
// Iterator itr=queue.iterator();
// while(itr.hasNext()){
// System.out.println(itr.next());
// }
// queue.remove();
// queue. poll();
// System.out.println("after removing two elements:");
// Iterator<String> itr2=queue.iterator();
// while(itr2.hasNext()){
// System.out.println(itr2.next());
// }
// }
// }
//in this order not maintainedthat's why ravi come after 
//in hashset not maintained


//in LinkedHashSet it maintained the order
// import java.util.*;
// public class TestJavaCollection{
// public static void main(String args[]){
// //Creating HashSet and adding elements
// LinkedHashSet<String> set=new LinkedHashSet<String>();
// set.add("Ravi");
// set.add("Vijay");
// set.add("Ravi");
// set.add("Ajay");
// //Traversing elements
// Iterator<String> itr=set.iterator();
// while(itr.hasNext()){
// System.out.println(itr.next());
// }
// }
// }

import java.util.*;
public class TestJavaCollection{
public static void main(String args[]){
//Creating HashSet and adding elements
TreeSet<String> set=new TreeSet<String>();
set.add("Ravi");
set.add("Vijay");
set.add("Apple");
set.add("Ajay");
//Traversing elements
Iterator<String> itr=set.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}

