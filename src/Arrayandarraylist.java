import java.util.ArrayList;
import java.util.List;

public class Arrayandarraylist {
    public static void main(String[]args ){
        List<Integer> Grades= new ArrayList<>();
        Grades.add(5);
        Grades.add(7);
        Grades.add(0,89);
        System.out.println(Grades.get(0));
        System.out.println(Grades.get(1));
        System.out.println(Grades.get(2));
9
    }
}
