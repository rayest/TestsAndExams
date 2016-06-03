package Exam;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import static net.mindview.util.Print.print;

/**
 * Created by Rayest on 2016/6/3 0003.
 */

//统计不同单词的个数，应用到含键值对的容器map
public class CountOccurrenceOfWords {
    public static void main(String[] args) {
        //String text = "Good morning. Have a good class. Have a good visit. have fun!";

        Scanner input = new Scanner(System.in);
        //注意要用nextLine， 表示enter键为结束标志。如果用直接用next，则遇到空格就会认为输入结束。
        String text = input.nextLine();

        //除以下特殊符号外的其他所有符号也都被当作一个单词
        String[] words = text.split("[ \n\t\r.,;':!?(){}]");
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();
            if (key.length() > 0){
                if (map.get(key) == null){
                    map.put(key, 1);
                }
                else{
                    int value = map.get(key).intValue();
                    value++;
                    map.put(key, value);
                }
            }
        }
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            print(entry.getValue() + "\t" + entry.getKey());
        }
    }
}
