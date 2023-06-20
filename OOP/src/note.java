import java.util.Scanner;
import java.util.stream.IntStream;

public class note{
    public static void main(String[] args) {
        int n = 5;
        int k = 5;
        Scanner sc = new Scanner(System.in);

        // instead of using scanner and for to import value in array we can use syntax :
        int[] arr = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();

        // if u want filter value by condition then use syntax :
        IntStream.range(0, n).filter(i -> arr[i] % 2 == 0).mapToObj(i -> arr[i] + " ").forEach(System.out::print);

        // when u need count value fit condition then u can use syntax :
        int count = (int) IntStream.range(0, n).filter(i -> arr[i] == k).count();

        // when u need count sum of array then u can use syntax :
        int sum = IntStream.range(0, n).filter(i -> arr[i] % 2 == 1).map(i -> arr[i]).sum();

        // Some method of Java with string :
        String str = sc.nextLine();
        int i = 0;
        // charAt(i) : return char at location i
        str.charAt(i);
        // replace('A','B') : replace char or substring
        str.replace('h','h');
        // toUpperCase() / toLowerCase()
        str.toLowerCase();
        str.toUpperCase();
        // indexOf(substring) return first location of substring on main string
        String substring = sc.nextLine();
        str.indexOf(substring);
        // startsWith(substring) endsWith(substring) return true false follow string has start with substring or end with substring
        str.startsWith(substring);
        str.endsWith(substring);

        // when u need pure a string u can use :

//        IntStream.iterate(str.length() - 1, i -> i >= 0, i -> i - 1).map(str::charAt).forEach(System.out::print);

    }
}


