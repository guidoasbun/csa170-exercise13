/* 
*   Guido Asbun
*   CS A170 
*   30-September-2020     
* 
*   Exercise 13
*/ 

import java.util.Scanner;
public class SumEvenNumbers{
    public static void main(String[] args){
        int result = 0;
        
        for (int i = 2; i <= 100; i += 2){
            result += i;
        }
        
        System.out.print("The sum is " + result);
    }
}