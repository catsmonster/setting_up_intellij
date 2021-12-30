import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("please insert a 4 digits integer:");
        num = sc.nextInt();
        System.out.println();
        System.out.print(num % 10);
        num /= 10;
        System.out.print(num % 10);
        num /= 10;
        System.out.print(num % 10);
        num /= 10;
        System.out.print(num % 10);
    }

}
