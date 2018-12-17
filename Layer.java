public class Layer{
  private Node[] nodeArray;
  private double[] outputArray;
  private int numberOfNodes;
  private Matrix matrix = new Matrix();


  public Layer(int value){
    nodeArray = new Node[value];
  }//End constructor

  //Node Array Methods----------------------------
  public Node[] getNodeArray(){
    return nodeArray;
  }

  public Node getNode(int value){
    return nodeArray[value];
  }//End Getter

  public void addNode(int value){
    nodeArray[value] = new Node();
    numberOfNodes ++;
  }//End Add Node
  //End Of Node Array Commands--------------------

  //Gives each node a Connection
  public void interconectNodes(Layer layer1, Layer layer2){

    for(int rep = 0; rep< layer1.getNumberOfNodes(); rep++ ){
      layer1.getNodeArray()[rep].makeConnectionsArray(layer1);
    }//End For

    for(int i = 0; i < layer2.getNumberOfNodes(); i++){
      for(int j =0; j < layer1.getNumberOfNodes(); j++){
        layer1.getNodeArray()[j].addConnections(layer1.getNodeArray()[j],layer2.getNodeArray()[i],i);
      }//End For
    }//End For
  }//End Interconect Nodes

  public void feedForward(Layer layer1, Layer layer2){
    for(int i = 0; i < layer2.getNumberOfNodes(); i++){
      for(int j =0; j < layer1.getNumberOfNodes(); j++){
          layer2.getNodeArray()[i].setInput(layer2.getNodeArray()[i].getInput() + layer1.getNodeArray()[j].getConnections()[i].getWeight()*layer1.getNodeArray()[j].getOutput());
      }//End For
    }//End For
  }//End Feed Forward
  public double[] getOutputArray(){
    return outputArray;
  }

  public int getNumberOfNodes(){
    return numberOfNodes;
  }//End Getter

}//End Class
