public class Ex13_2D_array {
  // array as parameter to function
  static void output(int [][] a){
    for(int i=0;i<a.length;i++){
      //System.out.print(a[i].length + " ");
      for(int j=0;j<a[i].length;j++)
        System.out.print(a[i][j] + " ");
      System.out.println();
    }
  }
  // update array in function
  static void update(int [][] a){
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a[i].length;j++){
        a[i][j] *= 10;
      }
    }
  }
  // create a new array obj with given size
  static int[][] return_array(int r, int c){
    int [][] a = new int[r][c];
    int count = 1;
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        a[i][j] = count++;
      }   
    }
      
    return a;
  }
  public static void main(String[] args) {
    int[][] myNum = { {1, 2, 3, 4}, {5, 6, 7},{8,9} };
    output(myNum);
    update(myNum);
    output(myNum);
    int[][] b = return_array(4,5);
    output(b);
    System.out.println(myNum);

  }
}
