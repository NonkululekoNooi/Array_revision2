
package array_revion2;

import java.util.Random;


public class Array_Revion2 {

   
    public static void main(String[] args) {
               Random random = new Random();
               int newValue;
               int intGroup [] = new int[50];
               
                 for(int pos =0; pos < intGroup.length; pos++){
                  intGroup [pos] = random.nextInt(100) ;
            
        }
                 
                     printArr(intGroup);
                    newValue = findValue(intGroup, 55);
                    System.out.println("value found at newValue"  + newValue);
                    
                    
    }
    
        private static void printArr(int[] inputArray) {
        int positions ;
          // using a for loop to print all the arrays that are stored 
       for(positions = 0; positions < inputArray.length; positions ++){
             System.out.println(positions + " = " + inputArray[positions]);
       }
    }
    
      private static int findValue(int[] inputArray, int valueToFind) {
        int output = inputArray.length;
            for(int index =0; index<inputArray.length; index++){
                output = index;
            }
        return output;
        
    }
      
  
    
}
