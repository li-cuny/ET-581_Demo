import java.lang.Math;

public class Ex01_Math {

  public static void main(String[] args) {
    // Math.max(x,y): find the highest value of x and y
    System.out.println(Math.max(5, 10));
    // Math.min(x,y): find the lowest value of x and y
    System.out.println(Math.min(5, 10));
    // Math.pow(x,y): find the x power y
    System.out.println(Math.pow(3, 2));
    // Math.sqrt(x): returns the square root of x
    System.out.println(Math.sqrt(64));
    // Math.abs(x): returns the absolute (positive) value of x
    System.out.println(Math.abs(-4.7));
    // Math.random(): returns a random number between 0.0 (inclusive), and 1.0
    // (exclusive)
    System.out.println(Math.random());
    // a random number between 0 and 100
    int randomNum = (int) (Math.random() * 101); // 0 to 100
    System.out.println(randomNum);

    System.out.println(Math.random());
    System.out.println((int) (Math.random() * 101)); // 0~100
    System.out.println((int) (Math.random() * 901)); // 0~900
    System.out.println((int) (Math.random() * 101 + 100)); // 100~200
  }

}
