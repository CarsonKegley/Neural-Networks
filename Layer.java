public class Layer{
  private Node[] nodeArray;
  private double[] outputArray;
  private double[] inputArray;
  private int numberOfNodes;
  private Matrix matrix = new Matrix();
  public Layer(int value){
    nodeArray = new Node[value];
    numberOfNodes = value;
    Matrix matrix = new Matrix();
    inputArray =  new double[value];
  }//End constructor

  public Node getNode(int value){
    return nodeArray[value];
  }//End Getter

  public void addNode(int value){
    nodeArray[value] = new Node();
  }//End Add Node

  public double[] getOutputArray(){
    return outputArray;
  }

  public void setLayerOneInputArray(double value, int position){
    inputArray[position] = value;
  }//End setInput
  public Node[] getNodeArray(){
    return nodeArray;
  }

  public int getNumberOfNodes(){
    return numberOfNodes;
  }//End Getter


  public void feedForward(Layer layer  ){
    for(int i = 0; i < layer.getNumberOfNodes(); i ++){
    layer.getNodeArray()[i].setOutput(matrix.multiply1d(layer.getInputArray(),nodeArray[i].getWeightArray()));
    }//End For
  }//End Feed Forward
  public double[] getInputArray(){
    return inputArray;
   
  }//End setOutput

  public void setInputArray(Layer layer){
    for(int i = 0; i < layer.getNumberOfNodes(); i++){
      inputArray[i] = layer.getNodeArray()[i].getOutput();
    }//End For
  }//End Set INput


}//End Class
