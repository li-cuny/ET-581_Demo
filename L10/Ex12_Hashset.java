import java.util.*;
class Ex12_Hashset{
  public static void main(String args[]){
    //Creating HashSet and adding elements  
    HashSet<String> set=new HashSet();
    set.add("One");
    set.add("Two");
    set.add("Three");
    set.add("Four");
    set.add("Five");
    set.add("Three");
    System.out.println(set);
    //System.exit(1);
    
    Iterator<String> i=set.iterator();
    while(i.hasNext())
    {
      System.out.println(i.next());
    }
    //System.exit(1);
    //Removing specific element from HashSet
    System.out.println("Remove Two");
    set.remove("Two");
    for(String j: set) System.out.println(j);
    //System.exit(1);

    HashSet<String> set1=new HashSet<String>();
    set1.add("Six");
    set1.add("Seven");
    set.addAll(set1);
    System.out.println(set);
    //System.exit(1);
    
    //Removing all the new elements from HashSet
    set.removeAll(set1);
    System.out.println(set);
    //Removing elements on the basis of specified condition
    set.removeIf(str->str.contains("e"));
    System.out.println(set);
    //System.exit(1);

    //Removing all the elements available in the set
    set.clear();
    System.out.println(set);
  }
}
