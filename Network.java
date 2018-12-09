public class Network{
  private int numberOfLayers;
  private Layer[] layerArray;

  public Network(int value){
    numberOfLayers = value;
    layerArray= new Layer[value];
  }//End constructor

  public int getNumberOfLayers(){
    return numberOfLayers;
  }//End Getter

  public void setNumberOfLayers(int value){
    numberOfLayers = value;
  }//End setter

  public Layer[] getLayerArray(int value){
    layerArray[value];
  }//End Getter

  public void addLayer(int value){
    layerArray[value] = new Layer();
  }//End addLayer


}//End Class
