import java.util.Scanner;
public class Zadacha10 {

    //Задача №10
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод элементов массива: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();

        int matrix[][] = new int[3][4];

        matrix[0][1] = a;
        matrix[0][2] = b;
        matrix[0][3] = c;
        matrix[1][1] = d;
        matrix[1][2] = f;
        matrix[2][2] = g;
        System.out.println("вывод значений всего массива: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
            int y = matrix[i][j];
                System.out.print(y+", ");
            }
            System.out.println();
        }
        System.out.println("вывод первой строчки умноженной на 3: ");
        for (int j = 0; j < 4; j++){
            int t = 3;
            t *= matrix[0][j];
            System.out.print(t+", ");
        }

    }
}
