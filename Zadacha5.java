import java.util.Scanner;

public class Zadacha5 {
    //Задача №5
    public static void main(String args[]) {


        int b=1, c=2, d=3, f=4, g =5, q=6, w=7, e=8,u=9;
        Scanner sc = new Scanner (System.in);
        System.out.println ("Ввести значение :");
        int a = sc.nextInt();

        System.out.println(a + "*"+"1"+"="+a*b);
        System.out.println(a + "*"+"2"+"="+a*c);
        System.out.println(a + "*"+"3"+"="+a*d);
        System.out.println(a + "*"+"4"+"="+a*f);
        System.out.println(a + "*"+"5"+"="+a*g);
        System.out.println(a + "*"+"6"+"="+a*q);
        System.out.println(a + "*"+"7"+"="+a*w);
        System.out.println(a + "*"+"8"+"="+a*e);
        System.out.println(a + "*"+"9"+"="+a*u);

        sc.close ();




    }



}
