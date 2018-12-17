public class Runner{
  public static void main(String[] args){

      Network base = new Network(3);
      base.addLayer(0,3);
      base.addLayer(1,2);
      base.addLayer(2,2);

      //Adding nodes
      for(int i = 0; i< 3;i++){
        base.getLayerArray()[0].addNode(i);
      }
      for(int i = 0; i< 2;i++){
        base.getLayerArray()[1].addNode(i);
      }
      for(int i = 0; i< 2;i++){
        base.getLayerArray()[2].addNode(i);
      }

      base.getLayerArray()[0].interconectNodes(base.getLayerArray()[0],base.getLayerArray()[1]);
      base.getLayerArray()[1].interconectNodes(base.getLayerArray()[1],base.getLayerArray()[2]);

      //Setting the inital inputs for the network
      for(int i = 0; i<3 ; i++ ){
        base.getLayerArray()[0].getNodeArray()[i].setInput(-1);
      }//End For

      for(int i = 0; i < 3; i++){
        base.getLayerArray()[0].getNodeArray()[i].setOutput(base.getLayerArray()[0].getNodeArray()[i].getInput());
      }//End For

      //Feeding Forward layer 1 to layer 2
      base.getLayerArray()[0].feedForward(base.getLayerArray()[0], base.getLayerArray()[1]);

      for(int i = 0; i < 2;i++){
        base.getLayerArray()[1].getNodeArray()[i].setOutput(base.getLayerArray()[1].getNodeArray()[i].getInput());
      }//End For

      //Feeding Forward Layer 2 to Layer 3
      base.getLayerArray()[1].feedForward(base.getLayerArray()[1], base.getLayerArray()[2]);

      for(int i = 0; i < 2;i++){
        base.getLayerArray()[2].getNodeArray()[i].setOutput(base.getLayerArray()[2].getNodeArray()[i].getInput());
      }//End For

      //Printing out the outputs
      for(int i = 0; i< 3;i ++){
        System.out.println("Output for layer 1 node "+i+" "+base.getLayerArray()[0].getNodeArray()[i].getOutput());
      }//End For
      // printing out the weights
      for(int i = 0 ; i<3; i++){
        for(int j =0; j< 2; j++){
          System.out.println("Weights for layer1 node "+i+" connection "+j+ base.getLayerArray()[0].getNodeArray()[i].getConnections()[j].getWeight());
        }//End For
      }
      for(int i = 0; i< 2;i ++){
        System.out.println("Output for layer 2 node "+i+" "+base.getLayerArray()[1].getNodeArray()[i].getOutput());
      }//End For
      // printing out the weights
      for(int i = 0 ; i<2; i++){
        for(int j =0; j< 2; j++){
          System.out.println("Weights for layer2 node "+i+" connection "+j+ base.getLayerArray()[1].getNodeArray()[i].getConnections()[j].getWeight());
        }//End For
      }

      for(int i = 0; i< 2;i ++){
        System.out.println("Output for layer 3 node "+i+" "+base.getLayerArray()[2].getNodeArray()[i].getOutput());
      }//End For



  }//End Main
}//End Class
