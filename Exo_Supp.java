//@author Gianluca Lucchesi

import java.util.Scanner;

public class Exo_Supp{
 public static void main(String [] args){

 int [] array = new int [20];
 int i = 0;
 String [] place = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", 
 "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th"}; // don't forget the quotes
 int searchedNb = 0;
 int found = 0, position1 = 0, position2 = 0, value = 0, even = 0, uneven = 0;


 Scanner sc = new Scanner(System.in);

 for (i = 0; i < 20; i++){         // cannot use 'array.length' because values have not been initialized --> length = 20 "spots", not 19 indices
  System.out.println("Choose the " + place[i] + " integer greater or equal to 1 to fill the array. Enter 0 to stop.");
  array[i] = sc.nextInt();
   if ((array[i] <= 0) || (i == 20)){
    break;
   }
  }

 System.out.println("Enter a value to see its (recurring) position in the array.");
 searchedNb = sc.nextInt();

 for (i = 0; i < array.length; i++){
  if (array[i] == searchedNb){
    System.out.println("The entered value occurs at position " + (i+1) + " of the array.");
    found = found+1;
   }
  }
 
 if (found == 0){
  System.out.println("The entered integer occurs at position -1.");
  }

  
 System.out.print("{"); // Shows array values
 for (i = 0; i < array.length; i++){ 
  System.out.print(array[i] + ",");
  } 
 System.out.println("}");
 

 System.out.println("Enter a first position");
 position1 = sc.nextInt();
 if (position1 > 20){
  do{
  System.out.println("Position out of reach. Please try again.");   
  position1 = sc.nextInt(); 
  } while (position1 < 0 || position1 > 20); 
 }

 System.out.println("Enter a second position");
 position2 = sc.nextInt();
 if (position2 > 20){
  do{
  System.out.println("Position out of reach. Please try again.");
  position2 = sc.nextInt(); 
  } while (position2 < 0 || position2 > 20);  
 }

 for (i = array.length-position1; i > position1+1; i--){
  array[i]=array[i-2];

 }

 for (i = position1+1; i < position2; i++){  // User inputs new values between 2 previously entered positions
  System.out.println("Enter a new value for position " + i);
  value = sc.nextInt();
  array[i] = value;
 }


 System.out.print("{");     // Shows array values
 for (i = 0; i < array.length; i++){ 
  System.out.print(array[i] + ",");
  } 
 System.out.println("}");

 System.out.println("Enter a first position");
 position1 = sc.nextInt();
 System.out.println("Enter a second position");
 position2 = sc.nextInt();

 for (i = position1+1; i < position2; i++){  // User inputs new values between 2 previously entered positions
  array[i] = 0;
 }

 for (i = 0; i < array.length; i++){
  if (array[i]%2 == 0){
   even = even+array[i];
  } else {
   uneven = uneven+array[i];
  }
 }
 System.out.println("The sum of all even values in the array equals " + even + ".");
 System.out.println("The sum of all uneven values in the array equals " + uneven + ".");
}
}