import java.util.*;  // Import the Collections class

public class Ex6_ArrayList {
  public static void main(String args[]){
    ArrayList<String> list=new ArrayList<String>();//Creating arraylist
    list.add("Mango");//Adding object in arraylist
    list.add("Apple");
    list.add("Banana");
    list.add("Grapes");
    //Traversing list through Iterator
    Iterator itr=list.iterator();//getting the Iterator
    while(itr.hasNext()){//check if iterator has the elements
      System.out.println(itr.next());//printing the element and move to next
    }
  }
}
