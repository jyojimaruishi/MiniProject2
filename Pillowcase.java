/**
@authors Jyoji Maruishi
@version 10-18-21
*/

import java.util.*;
class Pillowcase{
  private ArrayList<Candy> candies;
  //keeps a running total of candies depending on the number of spots taken in the Pillowcase
  private int number;
  
  //constant representing the maximum number of candy possible to be stored in a Pillowcase
  final int SIZE = 1000;

  Pillowcase(){
    candies = new ArrayList<Candy>();
    number = 0;
  }

  //returns the current number of candy
  int getCandyCount(){
    return number;
  }

  //draws a random candy and stores it to the candies ArrayList
  void getCandy(){

    Candy aCandy = new Candy();

    Random r = new Random();
    int randomNum = r.nextInt(100) + 1;

    //assigns candy type to the random candy
    if(randomNum <= 10){
      aCandy.setName("M&Ms");
    }

    else if(randomNum > 10 && randomNum <= 30){
      aCandy.setName("Pink Starburst");
    }

    else if(randomNum > 30 && randomNum <= 45){
      aCandy.setName("Hershey's Bar");
    }

    else if(randomNum > 45 && randomNum <= 55){
      aCandy.setName("Milky Way");
    }

    else if(randomNum > 55 && randomNum <= 70){
      aCandy.setName("Twix");
    }

    else if(randomNum > 70 && randomNum <= 95){
      aCandy.setName("Reese's");
    }

    else if(randomNum > 95){
      aCandy.setName("Kit Kat");
    }
  
    System.out.println("Trick or Treat! We got " + aCandy.getName());

    candies.add(aCandy);
    number ++;
  }

  //prints out the number of each kind of candy in Pillowcase
  public void printNumCandies(){
    //index of how many of each kind of candy
    int numCandies[] = new int [7];

    numCandies[0] = 0;
    numCandies[1] = 0;
    numCandies[2] = 0;
    numCandies[3] = 0;
    numCandies[4] = 0;
    numCandies[5] = 0;
    numCandies[6] = 0;

    //counts the number of each kind of candy in Pillowcase, and updates index
    for(int i = 0; i < candies.size(); i++){

      if(candies.get(i).getName().equals("M&Ms")){
        numCandies[0] ++;
      }

      else if(candies.get(i).getName().equals("Pink Starburst")){
        numCandies[1] ++;
      }

      else if(candies.get(i).getName().equals("Hershey's Bar")){
        numCandies[2] ++;
      }

      else if(candies.get(i).getName().equals("Milky Way")){
        numCandies[3] ++;
      }

      else if(candies.get(i).getName().equals("Twix")){
        numCandies[4] ++;
      }

      else if(candies.get(i).getName().equals("Reese's")){
        numCandies[5] ++;
      }

      else if(candies.get(i).getName().equals("Kit Kat")){
        numCandies[6] ++;
      }
    }

  //reports how many of each kind of candy we received, so long as the value is not zero
   System.out.println("We got...");
   if(numCandies[0] > 0){
     System.out.println(numCandies[0] + " M&Ms");
   }

   if(numCandies[1] > 0){
     System.out.println(numCandies[1] + " Pink Starburst");
   }

   if(numCandies[2] > 0){
     System.out.println(numCandies[2] + " Hershey's Bar");
   }

   if(numCandies[3] > 0){
     System.out.println(numCandies[3] + " Milky Way");
   }

   if(numCandies[4] > 0){
     System.out.println(numCandies[4] + " Twix");
   }

   if(numCandies[5] > 0){
     System.out.println(numCandies[5] + " Reese's");
   }

   if(numCandies[6] > 0){
     System.out.println(numCandies[6] + " Kit Kat");
   }
  }
  
}