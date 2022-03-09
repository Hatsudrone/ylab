import java.util.Scanner;

public class AllLoveMamba {
    public static void main(String[] args) {
        System.out.println("Введите имя");
        Scanner Scanner = new Scanner(System.in);
        String name = Scanner.nextLine();
        String love = "любит меня";
        for (int i = 1; i<= 10; i++)
            System.out.println( name + " "+ love);
    }
}
