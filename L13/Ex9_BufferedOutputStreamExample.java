import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
public class Ex9_BufferedOutputStreamExample{
    public static void main(String args[])throws Exception{
         FileOutputStream fout=new FileOutputStream("outfile.txt");
         BufferedOutputStream bout=new BufferedOutputStream(fout);
         String s="Ex9: Welcome to java class.";
         byte b[]=s.getBytes();
         bout.write(b);
         bout.write('\n');
         s="Ex9: Welcome to java course.";
         byte c[]=s.getBytes();
         bout.write(c);
         bout.flush();
         bout.close();
         fout.close();
         System.out.println("success");
    }
}

