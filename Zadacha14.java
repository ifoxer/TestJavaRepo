import java.util.Scanner;

public class Zadacha14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод числа:");
        String S = sc.nextLine();
        System.out.println("String - "+S);
        int X = Integer.parseInt(S);
        System.out.println("INT - "+X);
        double Y = X;
        System.out.println("double - "+Y);
    }
}
