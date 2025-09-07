// Given a sequence of positive integer numbers (which ends with the number 0). Find the largest
// element of the sequence.
// The number 0 itself is not included in the sequence but serves only as a sign of the sequence’s end.
import java.util.Scanner;

class sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int max=0;
        while(true){
            num = sc.nextInt();
            
        
        if(num==0){
break;
        }
            if(num>max){
                max=num;
            }
        }
        System.out.println(max);
    }
}
