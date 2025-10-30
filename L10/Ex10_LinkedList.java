import java.util.*;
public class Ex10_LinkedList {
  public static void main(String [] args){
    LinkedList<String> ll=new LinkedList<String>();
    ll.add("Mango");//Adding object in arraylist
    ll.add("Apple");
    ll.add("Grapes");
    ll.add("Banana");
    ll.add("Blueberry");
    ll.add("Pineapple");
    ll.add("Pear");
    ll.add("Kiwi");
    ll.add("Apple");
    ll.add("Papaya");
    System.out.println(ll);
    //Removing specific element from arraylist
    ll.remove("Pear");
    System.out.println(ll);
    //Removing element on the basis of specific position
    ll.remove(0);
    System.out.println(ll);
    LinkedList<String> ll2=new LinkedList<String>();
    ll2.add("Kiwi");
    ll2.add("Blackberry");
    // Adding new elements to arraylist
    ll.addAll(ll2);
    System.out.println(ll);
    //Removing all the new elements from arraylist
    ll.removeAll(ll2);
    System.out.println(ll);
    //Removing first element from the list
    ll.removeFirst();
    System.out.println(ll);
    //Removing first element from the list
    ll.removeLast();
    System.out.println(ll);
    //Removing first occurrence of element from the list
    ll.removeFirstOccurrence("Blueberry");
    System.out.println(ll);
    //Removing last occurrence of element from the list
    ll.removeLastOccurrence("Apple");
    System.out.println(ll);

    //Removing all the elements available in the list
    ll.clear();
    System.out.println(ll);

  }
}
