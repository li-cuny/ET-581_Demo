public class Ex6_logic {
  public static void main(String[] args) {
    /*int a = 5, b = 10;
    System.out.println("and (&&) operator");
    System.out.println(true && true);   // T
    System.out.println(true && false);  // F
    System.out.println(false && true);  // F
    System.out.println(false && false); // F
    System.out.println(a>4 && b<10);
    System.out.println(a!=b && 2*a==b);
    //System.exit(0);

    System.out.println("or (||) operator");
    System.out.println(true || true);   // T
    System.out.println(true || false);  // T
    System.out.println(false || true);  // T
    System.out.println(false || false); // F
    System.out.println(a>b || 2*a>=b);
    System.out.println(a>1 || 9<b);
    //System.exit(0);

    System.out.println("not (!) operator");
    System.out.println(! true);  // F
    System.out.println(! false); // T
    System.out.println(! (a<b));
    System.out.println(! (3*a<=b));
    //System.exit(0);
    */

    int x = 3, y = 2, z = 6;
    System.out.println(( x+y<z && y>z-2 || x + y == z-1 || x%y != z-5 ));
    System.out.println(( x+y<z && (y>z-2 || x + y == z-1) || x%y != z-5 ));
    System.out.println(( (x+y<z && y>z-2) || (x + y == z-1 || x%y != z-5) ));
    //  is higher than 
    System.out.println(true || false && false);
  }
}
/*
Operator Precedence
Operators	Precedence
postfix	expr++ expr--
unary	++expr --expr +expr -expr ~ !
multiplicative	* / %
additive	+ -
shift	<< >> >>>
relational	< > <= >= instanceof
equality	== !=
bitwise AND	&
bitwise exclusive OR	^
bitwise inclusive OR	|
logical AND	&&
logical OR	||
ternary	? :
assignment	= += -= *= /= %= &= ^= |= <<= >>= >>>=

*/
