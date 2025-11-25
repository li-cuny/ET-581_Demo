import java.io.FileInputStream;
public class Ex8_DataStreamExample {
     public static void main(String args[]){
          try{
            FileInputStream fin=new FileInputStream("outfile.txt");
            int i=fin.read();
            System.out.println(i);
            System.out.println((char)i);

            i=fin.read();
            System.out.println(i);
            System.out.println((char)i);

            fin.close();
          }catch(Exception e){System.out.println(e);}
     }
}

