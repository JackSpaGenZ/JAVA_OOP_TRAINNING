package array;

import java.util.Scanner;
import java.util.stream.IntStream;

public class array01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
        int k = sc.nextInt();
        int count = (int) IntStream.range(0, n).filter(i -> arr[i] == k).count();
        System.out.print(count);
    }
}
