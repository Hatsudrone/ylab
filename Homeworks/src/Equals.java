import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        System.out.println("Введите ваши имена");
    Scanner Scanner = new Scanner(System.in);
    String NameOne = Scanner.nextLine();
    String NameTwo = Scanner.nextLine();
    if (NameOne.equals(NameTwo))
        System.out.println("Длины имен равны");
    else {
        System.out.println("Ваши имена не равны");
    }
    }
    }
