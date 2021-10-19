/**
@authors Jyoji Maruishi
@version 10-18-21
*/

import java.util.*;
class Main {
  public static void main(String[] args) {
    //total 1000 candies
    //classes: candy (candyName, probability), pillowcase (store candy objects, candyCount, print array, and % of pillowcase filled up)

    //methods: getCandy, count candy type
    
    Pillowcase p = new Pillowcase();
    
    System.out.println("Happy Halloween! How many houses should we trick or treat at? ");
    
    //takes user input and stores as number of houses to be visited
    Scanner s = new Scanner(System.in);
    int houses = s.nextInt();

    //runs getCandy() for user inputted number of houses visited
    for(int h = 0; h < houses; h++){
      p.getCandy();
    }

    //reports number of candy and % of pillowcase filled
    System.out.println("We have " + p.getCandyCount() + " candies, " + p.getCandyCount() * 100 / p.SIZE + "% of our pillowcase.");

    p.printNumCandies();
  }
}