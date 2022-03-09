import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        System.out.println("Введите два ваших числа");
        Scanner Scanner = new Scanner(System.in);
        int num1 = Scanner.nextInt();
        int num2 = Scanner.nextInt();
        if (num1 > num2) {
            System.out.println(" Минимальное из двух чисел " + num2);
        } else {
            System.out.println("Минимальное из двух чисел " + num1);
        }
    }
}