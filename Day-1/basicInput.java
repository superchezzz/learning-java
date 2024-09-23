import java.util.Scanner;

public class basicInput{
    public static void main(String[] args){
        Scanner name= new Scanner(System.in);
        System.out.print("Hello!\nPlease enter your name: ");
        String userName= name.nextLine();
        System.out.println("Hello "+ userName + "!");
    }
}
