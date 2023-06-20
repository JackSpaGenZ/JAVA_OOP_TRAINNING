package array;

import java.util.Scanner;
import java.util.stream.IntStream;

public class array02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
        int sum = IntStream.range(0, n).filter(i -> arr[i] % 2 == 1).map(i -> arr[i]).sum();
        System.out.print(sum);
    }
}
