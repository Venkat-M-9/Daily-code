// Write a Java program that reads a sequence of temperature readings in degrees Celsius until a reading of 100 degrees or more is 
// encountered. Your program should output the highest temperature reading observed up to that point. You must take input as a sequence 
// of integer temperature values and print the highest value before the stopping condition.

// HINT: Assume you are dealing only with positive temperatures.
import java.util.Scanner;
class temperature{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
       int max=0;
        int temp;
        while(true){
              temp =sc.nextInt();
        
        if(temp>=100){
        break;
        }
        
        if(temp>=max){
            max= temp;
        }
    }
        System.out.println(max);
    }
}