public class Runner{
  public static void main(String[] args){
    Matrix_Multiplication m = new Matrix_Multiplication();
    int[][] a = {{1,2,3,4},{2,3,4,5}};
    int[][] b = {{1,2,3,4},{2,3,4,5}};

    System.out.println(m.mulitply(a,b));
    
  }//End Main
}//End Class
