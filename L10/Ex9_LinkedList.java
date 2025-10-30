import java.util.*;
public class Ex9_LinkedList{
   public static void main(String args[]){
     LinkedList<String> ll=new LinkedList<String>();
     System.out.println("Initial list of elements: "+ll);
     ll.add("Mango");//Adding object in arraylist
     ll.add("Apple");
     ll.add("Grapes");
     System.out.println(ll);
     //Adding an element at the specific position
     ll.add(1, "Banana");
     System.out.println(ll);
     LinkedList<String> ll2=new LinkedList<String>();
     ll2.add("Pineapple");
     ll2.add("Pear");
     //Adding second list elements to the first list
     ll.addAll(ll2);
     System.out.println(ll);
     LinkedList<String> ll3=new LinkedList<String>();
     ll3.add("Kiwi");
     ll3.add("Papaya");
     //Adding second list elements to the first list at specific position
     ll.addAll(1, ll3);
     System.out.println(ll);
     //Adding an element at the first position
     ll.addFirst("Blueberry");
     System.out.println(ll);
     //Adding an element at the last position
     ll.addLast("Blackberry");
     System.out.println(ll);
   }
}
