import java.util.Scanner;

public class Zadacha7 {
    //Задача №7
    public static void main(String args[]) {

        final int X = 5;
        final int Y = 25;
        final int Z = 48;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение для переменной Т:");
        int T = sc.nextInt();

        if (T == X){
            System.out.println("Данное значение имеется в константах");
        }else if(T == Y){
            System.out.println("Данное значение имеется в константах");
        }else if(T == Z){
            System.out.println("Данное значение имеется в константах");
        }else
            System.out.println("OK!");

          sc.close();

    }
}
