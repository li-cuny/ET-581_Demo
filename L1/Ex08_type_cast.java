
class Ex08_type_cast
 {
    public static void main(String[] args) {
      int myInt = 9;
      double myDouble = myInt; // Automatic casting: int to double

      System.out.println(myInt);      // Outputs 9
      System.out.println(myDouble);   // Outputs 9.0

      // no loss of value
      myInt = 10;
      myDouble = myInt;
      System.out.println(myInt);      // Outputs 10
      System.out.println(myDouble);   // Outputs 10.0
      

      // lossy conversion
      myDouble = 7.78;
      //myInt = myDouble;
      

      myInt = (int) myDouble; // Manual casting: double to int
      System.out.println(myDouble);   // Outputs 7.78
      System.out.println(myInt);      // Outputs 7
      

      double g = 1.78d;
      //int h = g; // error: lossy conversion
      int h = (int) g;
      System.out.println(h);
      //System.exit(1);

      int n1 = 11;
      int n2 = 2;
      System.out.println(n1+"/"+n2+"=" + n1/n2);
      System.out.println(n1+"/"+n2+"=" + (double)n1/n2);
      System.out.println(n1+"/"+n2+"=" + n1/(double)n2);
      System.out.println(n1+"/"+n2+"=" + (double)n1/(double)n2);
      System.out.println(n1+"/"+n2+"=" + (double)(n1/n2));

      //System.exit(0);

      /*boolean a = true;
      int b = (int)a; // boolean can not convert to int
      System.out.println(b);*/

      char c = 'A';
      System.out.println(c);

      int d = c;
      System.out.println(d);
      System.out.println("(char)66: " + (char)66);
      System.out.println("(int)'D': " + (int)'D');
      //System.exit(0);

      c = 40000; // max 65535
      System.out.println(c);
      //System.exit(0);


      int e = 97;
      //char f = e; // error: lossy conversion
      char f = (char)e;
      System.out.println(f);
      System.out.println((int)'f');
      System.out.println((int)'z');

      // char range -> 0 ~ 65535
      // short range -> -32678 ~ 32767
      // byte range -> -128 ~ 127
      // manual cast needed if convert short, byte to char
      short s = 100;
      f = (char)s;
      System.out.println(f);

      // windening casting chain (automatic cast)
      byte a1 = 100;
      short a2 = a1;
      int a3 = a2;
      long a4 = a3;
      float a5 = a4;
      double a6 = a5;
      //System.exit(0);

      // Narrow casting chain (manual cast)
      a5 = (float)a6;
      a4 = (long)a5;
      a3 = (int)a4;
      a2 = (short)a3;
      a1 = (byte)a2;
      System.exit(0);

      //System.out.println((int)"Hello"); // error
    }
}
