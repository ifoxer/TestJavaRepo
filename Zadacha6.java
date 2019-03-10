import java.util.Scanner;

public class Zadacha6 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод трех чисел с клавиатуры X,Y,Z :");

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();


        int A = X+Y+Z;
        int S = A/3;
        System.out.println("среднее арифметическое чисел X,Y,Z: "+S);
        int D = S/2;
        System.out.println("Деление среднего арифметического на 2 без остатка: "+D);
        //Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (D > 3);
        System.out.println("Программа выполнена корректно");

    }
}