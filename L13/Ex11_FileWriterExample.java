import java.io.FileWriter;
public class Ex11_FileWriterExample {
    public static void main(String args[]){
          try{
             FileWriter fw=new FileWriter("outfile.txt");
             fw.write("Ex11: Welcome to java world.");
             fw.close();
          }catch(Exception e){System.out.println(e);}
          System.out.println("Success...");
    }
}
