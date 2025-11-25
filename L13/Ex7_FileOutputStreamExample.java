import java.io.FileOutputStream;
// Java FileOutputStream is an output stream used for writing data to a file.
// If you have to write byte-oriented as well as character-oriented data 
// values into a file, use FileOutputStream class. 
// through FileOutputStream class. 

public class Ex7_FileOutputStreamExample {
    public static void main(String args[]){
        try{
             FileOutputStream fout=new FileOutputStream("outfile.txt");
             fout.write(65);
             fout.write(66);
             fout.write(67);
             fout.write('X');

             fout.close();
             System.out.println("success...");
        } catch(Exception e){System.out.println(e);}
    }
}
