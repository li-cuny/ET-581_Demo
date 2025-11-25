import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class Ex10_BufferedInputStreamExample{
   public static void main(String args[]){
      try{
          FileInputStream fin=new FileInputStream("outfile.txt");
          BufferedInputStream bin=new BufferedInputStream(fin);
          int i;
          while((i=bin.read())!=-1){
              System.out.print((char)i);
          }
          System.out.println();
          bin.close();
          fin.close();
      }catch(Exception e){System.out.println(e);}
   }
}

