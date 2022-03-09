import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        System.out.println("Введите четыре ваших числа");
        Scanner Scanner = new Scanner(System.in);
        int num1 = Scanner.nextInt();
        int num2 = Scanner.nextInt();
        int num3 = Scanner.nextInt();
        int num4 = Scanner.nextInt();
        int max = Math.max(Math.max(num1,num2),Math.max(num3,num4));
        System.out.println("Максимальное число из вами введенных "+max);

    }
}
