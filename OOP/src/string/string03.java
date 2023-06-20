package string;

import java.util.Scanner;

public class string03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
//                continue;
//            }
//            System.out.print(str.charAt(i));
//        }
        for (char c = '0'; c <= '9'; c++) {
            str = str.replace(c + "", "");
        }
        System.out.print(str);
    }
}
