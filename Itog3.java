import java.util.Scanner;
public class Itog3 {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текущий курс валюты: ");
        float i = sc.nextFloat();
        System.out.println("Введите колличество рублей: ");
        float x = sc.nextFloat();
        float y = i / x;
        System.out.println(y);
    }
}
