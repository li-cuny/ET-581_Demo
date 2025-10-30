import java.util.*;  // Import the Collections class

public class Ex7_ArrayList {
  public static void main(String args[]){
    ArrayList<String> list=new ArrayList<String>();//Creating arraylist
    list.add("Mango");//Adding object in arraylist
    list.add("Apple");
    list.add("Banana");
    list.add("Grapes");

    System.out.println("Traversing list through List Iterator:");
    //Here, element iterates in reverse order
    ListIterator<String> list1=list.listIterator(list.size());
    while(list1.hasPrevious())
    {
        String str=list1.previous();
        System.out.println(str);
    }
    //System.exit(1);

    System.out.println("Traversing list through for loop:");
    for(int i=0;i<list.size();i++)
    {
        System.out.println(list.get(i));
    }
    //System.exit(1);

    System.out.println("Traversing list through forEach() method:");
    //The forEach() method is a new feature, introduced in Java 8.
    //Here, we are using lambda expression
    list.forEach(a->{ System.out.println(a);});
    //System.exit(1);

    System.out.println("Traversing list through forEachRemaining() method:");
    Iterator<String> itr=list.iterator();
    itr.forEachRemaining(a->{System.out.println(a);});
    //Here, we are using lambda expression
  }
}
