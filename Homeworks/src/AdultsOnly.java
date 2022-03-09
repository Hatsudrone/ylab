import java.util.Scanner;

public class AdultsOnly {
    public static void main(String[] args) {
        System.out.println("Введите Ваш возвраст и имя");
        Scanner Scanner = new Scanner(System.in);
        int age = Scanner.nextInt();
        String name = Scanner.nextLine();
        if (age <=17)
            System.out.println("Подрасти еще");
        else if (age >= 20)
            System.out.println("И 18-ти достаточно");

    }
}
