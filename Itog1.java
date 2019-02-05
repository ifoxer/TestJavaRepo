import java.util.Scanner;

public class Itog1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение: ");
        int j = sc.nextInt();
        System.out.println("Таблица умножения для числа :"+j);

        for(int i=1;i<11;i++){

            System.out.print(j+"*"+i+"="+(i*j)+"\t\t");

        }


    }




}



