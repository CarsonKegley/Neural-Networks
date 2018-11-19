public class Runner{
  public static void main(String[] args){
    Matrix m = new Matrix();
    int[][] a = {{1,2,3},{2,3,4},{2,3,4}};
    int[][] b = {{1,2,3},{3,4,5},{2,3,5}};

    int[][] result = m.mulitply(a,b);
    int[][] resultAdd = m.add(a,b);

    for(int row = 0; row < a.length; row++){
      for(int col = 0; col <a.length; col++){
        System.out.print("\t" + result[row][col]);
      }//End For
      System.out.println();
    }//End For

    for(int row = 0; row < a.length; row++){
      for(int col = 0; col <a.length; col++){
        System.out.print("\t" + resultAdd[row][col]);
      }//End For
      System.out.println();
    }//End For

  }//End Main
}//End Class
