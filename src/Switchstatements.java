import java.util.Scanner;

public class Switchstatements {
    public static void main (String[]args){
        System.out.println("what state do you live?");
        Scanner scanner= new Scanner(System.in);
       String reply=scanner.nextLine();
       switch (reply){
           case "Anambara":
               System.out.println("Welcome. What can we do for you?");
               break;
           case "Lagos":
               System.out.println("Come back when your population has decreased");
               break;

        }

    }
}
