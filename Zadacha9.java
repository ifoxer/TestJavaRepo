import java.util.Scanner;

public class Zadacha9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значения массива: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int f = sc.nextInt();

        int[] sm = {a,b,c,d,f};

       System.out.println("Вывод элементов массива mass: ");
        for (int i = 0; i < 5; i++ ){
            System.out.println(sm[i] * 2);
        }

    }
}
