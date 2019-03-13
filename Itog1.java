import java.util.Scanner;


public class Itog1 {


    public static int bin (String base2){
        char[] chars = base2.toCharArray();
        int result = 0;
        int mult = 1;
        for (int i = base2.length() - 1; i >= 0; i--) {
            if (chars[i] == '1') {
                result += mult;
            }
            mult *= 2;
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение в бинарном формате: ");
        String str = sc.nextLine();
        int a = bin(str);
        System.out.println(a);
    }


}

