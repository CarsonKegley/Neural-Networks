public class Layer{
  private Node[] nodeArray;
  private double[] outputArray;

  public Layer(int value){
    nodeArray = new Node[value];
  }//End constructor

  public Node getNode(int value){
    nodeArray[value];
  }//End Getter

  public void addNode(int value){
    nodeArray[value] = new Node();
  }//End Add Node
}//End Class
