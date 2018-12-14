public class Runner{
  public static void main(String[] args){

      Network base = new Network(3);
      base.addLayer(0,3);
      base.getLayerArray()[0].addNode(0);
      base.getLayerArray()[0].addNode(1);
      base.getLayerArray()[0].addNode(2);
      System.out.println(base.getLayerArray()[0].getNode(0).getWeight());
      System.out.println(base.getLayerArray()[0].getNode(1).getWeight());
      System.out.println(base.getLayerArray()[0].getNode(2).getWeight());
      System.out.println();
      base.addLayer(1,2);
      base.getLayerArray()[1].addNode(0);
      base.getLayerArray()[1].addNode(1);
      System.out.println(base.getLayerArray()[1].getNode(0).getWeight());
      System.out.println(base.getLayerArray()[1].getNode(1).getWeight());
      System.out.println();
      base.addLayer(2,2);
      base.getLayerArray()[2].addNode(0);
      base.getLayerArray()[2].addNode(1);
      System.out.println(base.getLayerArray()[2].getNode(0).getWeight());
      System.out.println(base.getLayerArray()[2].getNode(1).getWeight());
      System.out.println();

      base.getLayerArray()[0].setLayerOneInputArray(0,-1);
      base.getLayerArray()[0].setLayerOneInputArray(1,-1);
      base.getLayerArray()[0].setLayerOneInputArray(2,-1);

      for(int i = 0; i <  base.getLayerArray()[0].getInputArray().length; i++){
          System.out.println(base.getLayerArray()[0].getInputArray()[i]);
      }//End For

      //Setting the weightArray
      for(int i = 0; i <  base.getLayerArray()[0].getNodeArray().length; i++){
          base.getLayerArray()[0].getNodeArray()[i].setWeightArray(base.getLayerArray()[0]);
      }//End For
      //Printing the weight Array
      for(int i = 0; i< base.getLayerArray()[0].getNodeArray()[0].getWeightArray().length ;i++){
        System.out.println(base.getLayerArray()[0].getNodeArray()[0].getWeightArray()[i]);
      }//End For

      base.getLayerArray()[0].feedForward(base.getLayerArray()[0]);
      System.out.println();
      System.out.println(base.getLayerArray()[0].getNode(0).getWeight());
      System.out.println(base.getLayerArray()[0].getNode(1).getWeight());
      System.out.println(base.getLayerArray()[0].getNode(2).getWeight());
      System.out.println();
      System.out.println(base.getLayerArray()[1].getNode(0).getWeight());
      System.out.println(base.getLayerArray()[1].getNode(1).getWeight());
      System.out.println();
      System.out.println(base.getLayerArray()[2].getNode(0).getWeight());
      System.out.println(base.getLayerArray()[2].getNode(1).getWeight());

  }//End Main
}//End Class
