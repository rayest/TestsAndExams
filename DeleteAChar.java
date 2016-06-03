package Exam;

import java.util.ArrayList;
import java.util.List;
import static net.mindview.util.Print.print;

/**
 * Created by Rayest on 2016/6/3 0003.
 */
public class DeleteAChar {
    public static void main(String[] args) {
        String oldString = "Will the world be better?";
        print(oldString);

        //法1：要用[]标注被替换的字符: ? ，第二个是替换字符：replace all "1" with "2"
        String newString1 = oldString.replaceAll("[?]", "");
        print(newString1);

        //法2：先将字符串分解成字符并存放在集合list中，
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < oldString.length(); i++) {
             list.add(oldString.charAt(i));
        }
        //再通过StringBuilder把需要的字符按原来的顺序连接成新的字符串
        StringBuilder newString2 = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String stringOfChar = list.get(i).toString();
            if (!stringOfChar.equals("?"))
            newString2.append(stringOfChar);
        }
        print(newString2);
    }
}
