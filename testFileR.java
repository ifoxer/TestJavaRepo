import java.io.*;

//Задача №15
public class testFileR {
/*
    public static void main(String[] args) {

        try(FileReader reader = new FileReader("primer.txt"))
        {

            int r;
            while((r=reader.read())!=-1){

                System.out.print((char)r);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
 */

//Задача №16

    public static void main(String[] args) {

        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ввести 'stop' для окончания записи ");

        try (FileWriter fw = new FileWriter("primer.txt")) {

            do {
                System.out.println(": ");
                str = br.readLine();

                if (str.compareTo("stop") == 0) break;

                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);

        } catch (IOException ex) {
            System.out.println("ошибка ввода-вывода:" + ex);

        }


    }
}
