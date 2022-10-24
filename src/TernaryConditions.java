import java.util.Scanner;

public class TernaryConditions {
    public static void main(String []args){

        Scanner scanner= new Scanner(System.in);
        String name= scanner.nextLine();
        String status = name.equals("Isaiah") ? ("You're cool.") : ("You're not cool.");
        System.out.println(status);

    }

}
