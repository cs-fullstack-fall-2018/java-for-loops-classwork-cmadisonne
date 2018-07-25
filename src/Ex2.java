import java.util.ArrayList;
import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args){
        String[] names = {"Bob","Kenn","Kevin","Erin"};
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.addAll(Arrays.asList(names));
        for (String students : studentList){
            System.out.println(students);
        }
    }
}
