import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("n = ");
        int num = input.nextInt();
        int output= Solution(num);
        System.out.print("Output : "+ output);

    }

    public static int Solution(int n){
        if(n==0){
            return 0;
        }if (n==1){
            return 1;
        }

        int[] fibonacci = new int[n + 1];
        fibonacci[0]=0;
        fibonacci[1]=1;

        for(int i=2; i<=n; i++){
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        }
        return fibonacci[n];
    }
}