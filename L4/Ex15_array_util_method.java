import java.util.Arrays;

public class Ex15_array_util_method {
    public static void main(String[] args) {
        int[][] myNum = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 8, 9 } };
        Arrays.fill(myNum, 1);
        System.out.println(Arrays.toString(myNum));
    }
}
