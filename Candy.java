/**
@authors Jyoji Maruishi
@version 10-18-21
*/

import java.util.*;
class Candy{
  private String name;

  //creates a new candy with no name assigned
  Candy(){
    name="";
  }

  //creates a new candy with a name = parameter value
  Candy(String aName){
    name = aName;
  }

  //mutator method for changing the name of a candy
  public void setName(String aName){
    name = aName;
  }

  //accessor method for retrieving the name of a candy
  String getName(){
    return name;
    //this returns the name of the candy
  }

  //print method utilizing the accessor method
  public void print(){
    System.out.println(getName());
  }


}