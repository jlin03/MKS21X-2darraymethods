public class Driver {
  public static void main(String[] args) {
    int[][] a = new int[4][4];
    for(int i = 0; i < 4;i++) {
      for(int x = 0; x < 4;x++) {
        a[i][x] = i + 1;
      }
    }
    System.out.println(ArrayMethods.rowSum(a,2));
    //12
    System.out.println(ArrayMethods.columnSum(a,0));
    //10
	System.out.println(ArrayMethods.isRowMagic(a));
	//false
	System.out.println(ArrayMethods.isColumnMagic(a));
	//true
	
  }

}
