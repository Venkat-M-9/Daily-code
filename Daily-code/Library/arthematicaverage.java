
import java.util.Scanner;

class arthematicaverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int count =0;
        int nice=0;
        double Result =0;
        for(int i=start;i<=end;i++){
            if(i%3==0){
                nice = nice +i;
                count++;
            }
        }
        //new intialization.
        Result = (double)nice/count;
        System.out.println(Result);
    }
}