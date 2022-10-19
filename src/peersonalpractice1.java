import java.util.Scanner;

public class peersonalpractice1 {

        //this is on comparison operators and loical operators
        public static void main(String[]args){
            System.out.println("Where do you live?");
            Scanner scanner= new Scanner(System.in);
            String location= scanner.nextLine();
            //String Gbagada= "Gbagada";
            System.out.println("How old are you?");
            int age  =scanner.nextInt();
            System.out.println(location + (" ") +age);

            if( age>17 && (location.equals("Gbagada"))){
                System.out.println("There would be a flood in Gbagada");

            }
            else{
                System.out.println("there will be no flood around you");};



        }

    }


