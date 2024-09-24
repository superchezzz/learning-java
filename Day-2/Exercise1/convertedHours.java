import java.util.Scanner;

public class convertedHours{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes= input.nextInt();

        int hours= minutes/60;
        int convertedMinutes= minutes%60;
        System.out.println("Converted hours: "+ hours + " hours and "+ convertedMinutes+ " minute/s");
    }
}