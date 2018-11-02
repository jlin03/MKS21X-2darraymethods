public class ArrayMethods {

  public static int rowSum(int[][] ary, int x) {
    int count = 0;
    for(int i = 0; i < ary[x].length; i++) {
      count += ary[x][i];
    }
    return count;
  }

  public static int columnSum(int[][] ary, int x) {
    int count = 0;
    for(int i = 0; i < ary.length; i++) {
      if(x < ary[i].length) {
        count += ary[i][x];
      }
    }
    return count;
  }







}
