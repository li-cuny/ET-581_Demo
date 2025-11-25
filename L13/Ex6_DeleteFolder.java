import java.io.File;

public class Ex6_DeleteFolder {
  public static void main(String[] args) {
    File myObj = new File("Test");
    if (myObj.mkdir()){
      System.out.println("Created the folder: " + myObj.getName());
    } else {
      System.out.println("folder exists.");
    }
    //System.exit(0);
    if (myObj.delete()) {
      System.out.println("Deleted the folder: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the folder.");
    }
  }
}
