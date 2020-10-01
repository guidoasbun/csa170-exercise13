 /* 
*   Guido Asbun
*   CS A170 
*   30-September-2020     
* 
*   Exercise 13
*/ 
import java.util.Scanner;
public class SumOfOddNumbers{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        int sum = 0;
        
        for (int i = a; i <= b ; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        
        System.out.print("The sum is " + sum);
    }
}