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

    */
/*
//Задача №6
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

    //  sc.close();

  }
*/
/*
//Задача №7
  public static void main(String args[]) {
      int i = 1;
      while (i <= 50){
          System.out.println(i);
          i++;
      }
  }
*/
/*
//Задача №8
  public static void main(String args[]) {
      int mass[] = {20,38,45,96,52};

      System.out.print("Вывод элементов массива mass: ");
      int t = 2;
      for(int elm : mass) {
          t *= elm;
          System.out.print(t + ", ");
      }
  }
*/
/*
//Задача №9
  public static void main(String args[]) {
      int matrix[][] = new int[3][4];

      matrix[0][1] = 2;
      matrix[0][2] = 4;
      matrix[0][3] = 6;
      matrix[1][1] = 3;
      matrix[1][2] = 9;
      matrix[2][2] = 7;
//вывод значений всего массива:
      for (int i = 0; i < 3; i++){
          for (int j = 0; j < 4; j++){

              System.out.print(matrix[i][j]);
          }
          System.out.println();
      }
//вывод первой строчки умноженной на 3:
      for (int j = 0; j < 4; j++){
          int t = 3;
          t *= matrix[0][j];
          System.out.print(t+", ");
      }

  }
*/
/*
//Задача №10
  public static void main(String args[]) {
      String text = "Привет мир!";
      //System.out.print(text);
      //}
//Задача №11
      String prb = text.replaceAll(" ", "");
          System.out.print(prb);
      }

//Задача №12
  public static void main(String args[]) {
      String str1 = "Прекрасный мир";
      String str2 = "Привет прекрасный мир";
      int a = str1.length();
      int b = str2.length();
      if (a > b ){
          System.out.println(str1);
      }else
          System.out.println(str2);
  }
*/
/*
//Задача №13
  public static void main(String args[]) {
      String S = "13";
      System.out.println(S);
      int X = Integer.parseInt(S);
      System.out.println(X);
      double Y = X;
      System.out.println(Y);

  }
 */
//Задача №14
    public static void main(String[] args) {

        int arr[] = {25, 97, 82, 62, 5};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)

            System.out.println(arr[i]);
    }
}
















