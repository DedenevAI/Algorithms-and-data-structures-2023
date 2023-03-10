package task15;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringWithRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(s, " ");
        List<String> list = new LinkedList<>();

        while (st.hasMoreTokens()) {
            String buf = st.nextToken();
            if (!list.contains(buf))
                list.add(buf);
        }
        for (String ss : list) {
            System.out.println(ss);
        }
    }
}
