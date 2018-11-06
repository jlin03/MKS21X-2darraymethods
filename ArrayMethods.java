public class ArrayMethods {

  public static int rowSum(int[][] ary, int x) {
    int count = 0;
	if(x >= ary.length) {
		return 0;
	}
    for(int i = 0; i < ary[x].length; i++) {
		count += ary[x][i];
    }
    return count;
  }

  public static int columnSum(int[][] ary, int x) {
    int count = 0;
	int max = maxRowSize(ary);
	if(x >= max) {
		return 0;
	}
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
    int max = maxRowSize(ary);
	int[] out = new int[max];
    for(int i = 0; i < max;i++) {
      out[i] = columnSum(ary, i);
    }
    return out;
  }
  
  public static boolean isRowMagic(int[][] ary) {
	  int[] check = allRowSums(ary);
	  
	  for(int i = 0; i < check.length - 1; i++) {
		  if(check[i] != check[i+1]) {
			  return false;
		  }
	  }
	  return true;
  }
  
  public static boolean isColumnMagic(int[][] ary) {
	  int[] check = allColSums(ary);
	  
	  for(int i = 0; i < check.length - 1; i++) {
		  if(check[i] != check[i+1]) {
			  return false;
		  }
	  }
	  return true;
  }
  
  
  
  private static int maxRowSize(int[][] ary) {
	int max = 0;
    for(int i = 0; i < ary.length;i++) {
      if(ary[i].length > max) {
        max = ary[i].length;
      }
    }
	return max;
  }

}
