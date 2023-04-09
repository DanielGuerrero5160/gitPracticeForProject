import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> strList=new ArrayList<>();
        strList.add("1");
        strList.add("1");
        strList.add("1");
        strList.add("1");
        strList.add("1");
        strList.add("1");
        strList.add("1");

        for (String s:
             strList) {
            System.out.println(s);
        }
    }
}
