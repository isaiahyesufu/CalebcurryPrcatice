import java.util.Scanner;

public class Intoductiontoloops {
    public static void main(String[]args){
        System.out.println("What State is Isaiah from?");
        Scanner scanner= new Scanner(System.in);
        String State= scanner.nextLine();
        while(!State.toLowerCase().equals("osun")){
            System.out.println("Try again");
            State= scanner.nextLine();

        }
        System.out.println("You finally got it");



    }
}
