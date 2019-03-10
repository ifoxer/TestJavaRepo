import java.util.Scanner;

public class Itog2 {


    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите массив:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int arr[] = {a, b, c, d, e};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        System.out.println("Результат сортировки: ");
        for (int i = 0; i < arr.length; i++)

            System.out.print(arr[i]+", ");
    }
}
