package string;

import java.util.Scanner;
import java.util.stream.IntStream;

public class string04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
//                    count = count + 1;
//                }
//        }
        count = (int) IntStream.range(0,str.length()).filter(i -> str.charAt(i) >= 'A' && str.charAt(i) <= 'Z').count();
        System.out.print(count);
    }
}
