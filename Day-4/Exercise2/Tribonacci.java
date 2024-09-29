import java.util.Scanner;

public class Tribonacci{
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
        }if (n==2){
            return 2;
        }

        int[] tribonacci = new int[n + 1];
        tribonacci[0]=0;
        tribonacci[1]=1;
        tribonacci[2]=2;

        for(int i=2; i<=n; i++){
            tribonacci[i]=tribonacci[i-1]+tribonacci[i-2]+tribonacci[i-3];;
        }
        return tribonacci[n];
    }
}