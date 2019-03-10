import java.util.Scanner;
public class Itog3 {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текущий курс валюты: ");
        double i = sc.nextFloat();
        System.out.println("Введите колличество рублей: ");
        double x = sc.nextFloat();
        double y = x / i;
        System.out.println(y);
    }
}
