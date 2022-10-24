import java.util.Scanner;

public class forloopandnestedstatements {
    public static void main(String[] args) {
        System.out.println("What number do you want to stop at?");
        Scanner scanner = new Scanner(System.in);
        int lenght = scanner.nextInt();
        if (lenght <= 20) {
            for (int i = 1; i < (lenght + 1); i++) {
                System.out.println(i);
                if (i== (lenght/2)){
                    System.out.println("We have gotten to the middle of your loop");
                }
                if (i == lenght) {
                    System.out.println("We have gotten to the final number of your loop")
                    ;
                }

            }


        } else {
            System.out.println("your number is too long");
        }
    }
}