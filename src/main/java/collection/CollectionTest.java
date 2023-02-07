package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    List<Double> output=new ArrayList<>();
    for (int i=0; i<input.size(); i++){
      output.add(Math.pow(((input.get(i).doubleValue()*2)+3),5));
    }
    return output;
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    List<String> output=new ArrayList<>();
    for (int i=0;i<input.size();i++){
      if (input.get(i)==""){
        output.add(input.get(i));
      }
      else if(input.get(i)==null){
        output.add(input.get(i));
      }
      else{
        output.add(input.get(i).substring(0,1 ).toUpperCase()+input.get(i).substring(1)+input.get(i).substring(0,1 ).toUpperCase()+input.get(i).substring(1));
      }
      
    }
    return output;
  }

}
