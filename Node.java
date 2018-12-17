public class Node{
  private double input;
  private double output;
  private Connection[] connections;
  private int numberOfConnection = 0;
  private double inputArray[];

  public double getInput(){
    return input;
  }//End getInput

  public void setInput(double value){
    input = value;
  }//End Set Input

  public double getOutput(){
    return output;
  }//End getOutput

  public void setOutput(double value){
    output =  1/(1+ Math.exp(-value));
  }//End setWeight

  public void makeConnectionsArray(Layer layer){
    connections = new Connection[layer.getNumberOfNodes()];
  }//End makeConnectionsArray
  public void addConnections(Node node1, Node node2, int value){
    connections[value] = new Connection(node1,node2);
    numberOfConnection ++;
  }

  public Connection[] getConnections(){
    return connections;
  }
  /*public void setWeightArray(Layer layer){
      weightArray=new  double[layer.getNumberOfNodes()];
    for(int i = 0; i < layer.getNumberOfNodes(); i ++){
      weightArray[i] = weight;
    }//Setter For loop
  }//End Weight Array*/

}//End Class
