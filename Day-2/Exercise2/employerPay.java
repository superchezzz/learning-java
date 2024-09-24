import java.util.Scanner;

public class employerPay{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Hourly Rate : ");
        double hourlyRate= input.nextDouble();
        System.out.print("Hours worked : ");
        double hoursWorked= input.nextDouble();
        
        double grossPay= hourlyRate*hoursWorked;
        double tax= grossPay*.15;
        double netPay= grossPay-tax;

        System.out.print("Gross pay : "+ grossPay + "\nWithholding tax : " + tax + "\nNet pay : "+ netPay);
    }
}