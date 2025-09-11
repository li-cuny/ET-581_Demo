
public class Ex14_array_class {
  public static void main(String[] args) {
    int[] nums = new int[3];
    double[] doubles = new double[3];
    String str = "this is a String";
    String[] strings = new String[3];
    System.out.println(nums.getClass().getName());
    System.out.println(doubles.getClass().getName());
    System.out.println(str.getClass().getName());
    System.out.println(strings.getClass().getName());
  }
}
