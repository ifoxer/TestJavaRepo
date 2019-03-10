import java.util.Scanner;

public class Zadacha13 {
    //Задача №13

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод первой строки: ");
        String str1 = sc.nextLine();
        System.out.println("Ввод второй строки: ");
        String str2 = sc.nextLine();
        int a = str1.length();
        int b = str2.length();
        System.out.println("Строка с наибольшей длиной: ");
        if (a > b ){
            System.out.println(str1);
        }else
            System.out.println(str2);
    }
}
