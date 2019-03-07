import java.util.Scanner;

public class Zadacha4 {
    //Задача №4
    public static void main(String args[]) {

        Scanner sc = new Scanner (System.in);
        System.out.println ("Ввести значение в бинарном формате:");
        String s = sc.nextLine();
        int a = Integer.parseInt(s,2);
        System.out.println (a);
        sc.close ();

    }



}