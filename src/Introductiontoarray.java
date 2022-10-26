import java.util.Arrays;
import java.util.Scanner;

public class Introductiontoarray {
    public static void main(String[]args){
        System.out.println("How many objects do you want to be in your array?");
        Scanner scanner= new Scanner(System.in);
        int size= scanner.nextInt();
        System.out.println("please input your data");
        int[]data= new int[size];
        for(int i=0;i<size;i++){
            int x= scanner.nextInt();
            data[i]=x;
            if(data[i]== 31){
                System.out.println("We have found the missing number 31 ");

            }

         }
        System.out.println(Arrays.toString(data));

    }
}
