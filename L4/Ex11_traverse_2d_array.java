
public class Ex11_traverse_2d_array {
  public static void main(String[] args) {
    int[][] a = {{1,2,3,4},{4,5,6,7},{7,8,9,10}}; // a[3][3]
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a[i].length;j++){
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}
/*
1. create a two dim array which save

10 11 12 13 14
15 16 17 18 19
20 21 22 23 24
25 26 27 28 29

print everything in the 2d array use for loop

2. times 10 to each element and print out

100 110 120 130 140
150 160 170 180 190
200 210 220 230 240
250 260 270 280 290

3. print only even numbers of the Arrays

10 12 14
16 18
20 22 24
26 28

*/
