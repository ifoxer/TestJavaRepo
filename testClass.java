import java.util.Scanner;

public class testClass {

  /*  public static void main(String args[]) {
        System.out.println("Hello,world!");
    }  */

/*
//Задание №4
    public static void main(String args[]) {
        //1. Ввод трех чисел с клавиатуры X,Y,Z
        int X = 15;
        int Y = 25;
        int Z = 13;
        //2. Нахождение и вывод на экран среднего арифметического чисел X,Y,Z
        int A = X+Y+Z;
        int S = A/3;
        System.out.println(S);
        //3. Деление среднего арифметического на 2 без остатка
        int D = S/2;
        System.out.println(D);
        //4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (D > 3);
        System.out.println("Программа выполнена корректно");

    }
*/
//Задание №5
  public static void main(String args[]) {

      Scanner sc = new Scanner (System.in);
      System.out.println ("Ввести значение в бинарном формате:");
      String s = sc.nextLine();
      int a = Integer.parseInt(s,2);
      System.out.println (a);
      sc.close ();
    }

//пример: вводим 11110000 получаем 240






}



