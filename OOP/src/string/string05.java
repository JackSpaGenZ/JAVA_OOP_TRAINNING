package string;

import java.util.Scanner;
import java.util.stream.IntStream;

public class string05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        for (int i = str.length() - 1 ; i >= 0 ; i--) {
//            System.out.print(str.charAt(i));
//        }
        IntStream.iterate(str.length() - 1, i -> i >= 0, i -> i - 1).map(str::charAt).forEach(System.out::print);
    }
}
