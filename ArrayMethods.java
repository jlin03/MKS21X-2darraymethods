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

  public static int[] allRowSums(int[][] ary) {
    int[] out = new int[ary.length];
    for(int i = 0; i < ary.length;i++) {
      out[i] = rowSum(ary, i);
    }
    return out;
  }

  public static int[] allColSums(int[][] ary) {
    int[] out = new int[ary.length];
    int maxRowSize = 0;
    for(int i = 0; i < ary.length;i++) {
      if(ary[i].length > maxRowSize) {
        maxRowSize = ary[i].length;
      }
    }
    for(int i = 0; i < maxRowSize;i++) {
      out[i] = columnSum(ary, i);
    }
    return out;
  }





}
