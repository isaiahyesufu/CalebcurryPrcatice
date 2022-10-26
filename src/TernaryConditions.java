import java.util.Scanner;

public class TernaryConditions {
    public static void main(String []args){
        System.out.println("Type in your name to know if you're cool");

        Scanner scanner= new Scanner(System.in);
        String name= scanner.nextLine();
        String status = name.equals("Isaiah") ? ("You're cool.") : ("You're not cool.");
        System.out.println(status);

    }

}
