public class Connection{
  private double weight;
  private Node inputNode;
  private Node outputNode;

  public Connection(Node input, Node output){
    weight = Math.random()*2-1;
    inputNode = input;
    outputNode = output;
  }//End Constructor

  public double getWeight(){
    return weight;
  }//End Get weight
  public Node getInputNode(){
    return inputNode;
  }//End Getter

  public Node getOutputNode(){
    return outputNode;
  }//End Getter

}//End Class
