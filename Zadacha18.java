import java.io.*;
import java.util.Scanner;

public class Zadacha18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//читаем файл
        try (BufferedReader br = new BufferedReader
                (new FileReader("primer.txt")))
        {

            String r;
            while ((r = br.readLine()) != null) {
                System.out.print("Текст из файла: "+r+"\n");

            }

        }catch (IOException ex ){

            System.out.println("ошибка ввода-вывода:" + ex);
        }

//перезаписываем в файл
        try (FileWriter writer = new FileWriter("primer.txt", false)) {
            // запись строки
            System.out.println("Введите текст для записи :");
            String text = sc.nextLine();
            writer.write(text);
            System.out.println("Перезаписанный текст: "+text);

            writer.flush();
        } catch (IOException ex) {

            System.out.println("ошибка ввода-вывода:" + ex);
        }
    }
}

