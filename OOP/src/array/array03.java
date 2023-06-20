package array;

import java.util.Scanner;
import java.util.stream.IntStream;

public class array03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = IntStream.range(0,n).map(i -> sc.nextInt()).toArray();
        IntStream.range(0,n).filter(i -> arr[i] >= 0 && arr[i] <= 10 ).mapToObj(i -> arr[i] + " " ).forEach(System.out::print);
    }
}
