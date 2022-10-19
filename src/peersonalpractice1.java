import java.util.Scanner;

public class peersonalpractice1 {

        //this is on comparison operators and logical operators
        public static void main(String[]args){
            System.out.println("Where do you live?");
            Scanner scanner= new Scanner(System.in);
            String location= scanner.nextLine();
            //String Gbagada= "Gbagada";
            System.out.println("What is your house number?");
            int HouseNumber =scanner.nextInt();
            System.out.println(location + (" ") +HouseNumber);

            if(HouseNumber>12 && (location.equals("Gbagada"))){
                System.out.println("There would be a flood around your house.Be careful!");

            }
            else{
                System.out.println("there will be no flood around you");};



        }

    }


