import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();


        Student mark = new Student("Mark", 3.87);
        Student linda = new Student("Linda", 4.12);
        Student clarence = new Student("Clarence", 3.93);

        Collections.sort(student);
        System.out.println(student);


    }
}
