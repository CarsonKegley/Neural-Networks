public class Layer{
  private Node[] nodeArray;
  private double[][] outputArray;
  private double[] imputArray;
  private int numberOfNodes;
  public Layer(int value){
    nodeArray = new Node[value];
    numberOfNodes = values;
  }//End constructor

  public Node getNode(int value){
    return nodeArray[value];
  }//End Getter

  public void addNode(int value){
    nodeArray[value] = new Node();
  }//End Add Node

  public double[][] getOutputArray(){
    return outputArray;
  }

  public Node[] getNodeArray(){
    return nodeArray;
  }

  public int getNumberOfNodes(){
    return numberOfNodes;
  }//End Getter

  public void feedForward(Layer layer){
    for(int i =0; i < Layer.numberOfNodes(); i ++){
    nodeArray[i].setOutput(Matrix.Multiply(Layer.getOutputArray(),nodeArray[i].getWeightArray()));
    }//End For
  }//End Feed Forward

}//End Class
