// Import the HashMap class
import java.util.HashMap;
import java.util.Map;
public class Ex11_Hashmap {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
    //System.exit(1);
    for (String i : capitalCities.keySet()) {
      System.out.println("key: " + i + " value: " + capitalCities.get(i));
    }
    //System.exit(1);

    capitalCities.putIfAbsent("USA", "New York");
    capitalCities.putIfAbsent("Japan", "Tokyo");
    for(Map.Entry m:capitalCities.entrySet()){
      System.out.println(m.getKey()+" "+m.getValue());
    }
    //System.exit(1);
    
    HashMap<String,String> map=new HashMap<String,String>();
    map.put("China","Beijing");
    map.putAll(capitalCities);
    System.out.println(map);
    //System.exit(1);

    //key-based removal
    map.remove("Japan");
    System.out.println(map);
    //key-value pair based removal
    map.remove("Germany", "Berlin");
    System.out.println(map);
    //System.exit(1);

    map.replace("USA", "New York");
    System.out.println(map);
    
    map.replace("China", "Beijing", "Shanghai");
    map.replace("England", "Liverpool", "Manchester");
    System.out.println(map);
    //System.exit(1);
    
    map.replaceAll((k,v) -> "New York");
    System.out.println(map);

    System.out.println(map.get("USA"));
  }
}
