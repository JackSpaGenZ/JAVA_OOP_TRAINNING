package method;

import java.util.Scanner;
import java.util.stream.IntStream;

public class method01 {
    public static void show3and5(int [] arr, int n) {
        IntStream.range(0,n).filter(i -> arr[i]%3 == 0 && arr[i]%5 != 0).mapToObj(i -> arr[i] + " ").forEach(System.out::print);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = IntStream.range(0,n).map(i-> sc.nextInt()).toArray();
        show3and5(arr,n);
    }
}