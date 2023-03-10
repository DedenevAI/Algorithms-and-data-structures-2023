package task4;

import com.sun.deploy.util.StringUtils;

public class StringCount {
    public static void main(String[] args) {
        System.out.println(stringCounter("Hello","l"));
    }

    public static int stringCounter(String str, String elm) {
        int count = 0;
        int idx = 0;
        while ((idx = str.indexOf(elm, idx)) != -1) {
            count++;
            idx += elm.length();
        }
        return count;
    }
}
