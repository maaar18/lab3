import java.util.regex.*;
import java.util.Scanner;

public class Lab3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите пароль:");
        String password = sc.nextLine();

        String pattern = "[^!@#$%^&*;:,.|/<>=-](?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}[^!@#$%^&*;:,.|/<>=-]";
        Pattern p = Pattern.compile(pattern);
        System.out.println("Результат:" + password.matches(pattern));

        sc.close();

    }
}
