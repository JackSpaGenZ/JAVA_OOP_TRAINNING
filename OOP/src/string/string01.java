package string;
import java.util.Scanner;


public  class string01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String child_Str = sc.nextLine();
        str = str.toLowerCase();
        child_Str = child_Str.toLowerCase();
        System.out.print(str.indexOf(child_Str));
    }
}