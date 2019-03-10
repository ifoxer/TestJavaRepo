import java.util.Scanner;

public class Zadacha12 {
    //Задача №12
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод текста: ");
        String text = sc.nextLine();
        System.out.println("Вывод текста без пробелов: ");


    String prb = text.replaceAll(" ", "");
        System.out.print(prb);
    }
}
