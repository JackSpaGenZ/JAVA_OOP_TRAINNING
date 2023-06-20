package string;

import java.util.Arrays;
import java.util.Scanner;

public class string02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] substrings = str.split(" ");
        Arrays.stream(substrings).forEach(System.out::println);
    }
}
