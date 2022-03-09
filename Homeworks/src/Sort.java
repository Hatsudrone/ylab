import java.util.Scanner;
public class Sort {
    public static void main(String[] args) {
        System.out.println("Введите три ваших числа");
        Scanner Scanner = new Scanner(System.in);
        int a = Scanner.nextInt();
        int b = Scanner.nextInt();
        int c = Scanner.nextInt();
        if (a < b && a < c && b <a && b < c && c <a && c < b)
            System.out.print(a + " "+ b +" "+ c);
        else   if (b <= a && b <= c)
            System.out.print(b +" "+ c +" "+ a);
        else   if (c <= a && c <= b)
            System.out.print(c +" "+ a+" "+  b);

    }
}
