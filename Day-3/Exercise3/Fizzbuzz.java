import java.util.Scanner;
public class Fizzbuzz{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= input.nextInt();

        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz\n");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}