//Write a Java method to compute the average of three numbers.
import java.util.Scanner;

public class average{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Input the first number: ");
        float n1= input.nextFloat();
        System.out.print("Input the second number: ");
        float n2= input.nextFloat();
        System.out.print("Input the third number: ");
        float n3= input.nextFloat();
        System.out.println("The average value is "+ ave(n1, n2,n3));
    }
    public static float ave(float n1, float n2, float n3){
        return (n1+n2+n3)/3;
    }
}

