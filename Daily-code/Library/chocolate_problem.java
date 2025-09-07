import java.util.Scanner;

class  Chocolate_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int M = scanner.nextInt();
        int K=scanner.nextInt();

        if(k%N==0 || K%M==0){
            System.out.println("YES");
        }
        else{
        System.out.println("NO");
            }
    }
}