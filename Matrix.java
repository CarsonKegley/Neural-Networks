public class Matrix{

  public int[][] mulitply(int[][] a, int[][] b){
    assert a.length == b[0].length : "Dimension missmatch";
    assert a[0].length ==b.length : "Dimension missmatch";

    int[][] product = new int[a.length][b[0].length];
    for(int x =0; x < a.length ; x++){
      for(int y = 0; y < b[x].length; y++ ){
        for(int z = 0; z < a[y].length; z++ ){
          product[x][y] += a[x][z] * b[z][y];

        }//End For 3
      }//End For 2
    }//End For 1
    return product;
  }//End Multiply

  public int[][] add(int[][] a, int[][] b){
    assert a.length == b.length : "Dimension missmatch";
    assert a[0].length ==b[0].length : "Dimension missmatch";

    int[][] product = new int[a.length][a[0].length];
      for(int row = 0; 0 < a.length; row++){
        for(int col = 0; 0 < a[0].length; col++  ){
          product[row][col] = a[row][col] +  b[row][col];
        }//End for
      }//End For
    return product;
  }//End Addition
}//End class
