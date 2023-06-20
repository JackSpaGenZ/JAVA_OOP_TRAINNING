package array;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;

public class array04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = IntStream.range(0,n).map(i -> sc.nextInt()).toArray();
        Arrays.sort(arr);
        IntStream.range(0,n).mapToObj(i -> arr[i] + " ").forEach(System.out::print);
    }
}
