public class Node{
  private double weight;
  private double input;
  private double output;
  private double[] weightArray;

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

    output =  1/(1+ Math.exp(-value));

  }//End setWeight

  public Node(){
    weight = Math.random()*2-1;
  }//End Construcator

  public void setWeightArray(Layer layer){
      weightArray=new  double[layer.getNumberOfNodes()];
    for(int i = 0; i < layer.getNumberOfNodes(); i ++){
      weightArray[i] = weight;
    }//Setter For loop
  }//End Weight Array

  public double[] getWeightArray(){
    return weightArray;
  }//End getWeightArray

}//End Class
