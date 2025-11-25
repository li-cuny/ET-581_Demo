import java.io.FileReader;
public class Ex12_FileReaderExample {
    public static void main(String args[])throws Exception{
          FileReader fr=new FileReader("outfile.txt");
          int i;
          while((i=fr.read())!=-1)
            System.out.print((char)i);
          System.out.println();
          fr.close();
    }
}

