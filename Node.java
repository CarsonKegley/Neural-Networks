public class Node{
  private double weight;
  private double input;
  private double output;

  public double getWeight(){
    return weight;
  }//End getWeight

  public double getInput(){
    return input;
  }//End getInput

  public double getOutput(){
    return output;
  }//End getOutput

  public void setWeight(double value){
    weight = value;
  }//End setWeight

  public void setInput(double value){
    input = value;
  }//End setWeight

  public void setOutput(double value){
    output = value;
  }//End setWeight

  public Node(){
    weight =  Math.random() * 5 + 1;
  }//End Construcator

}//End Class
