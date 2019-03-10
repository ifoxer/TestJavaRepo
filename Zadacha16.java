import java.io.*;

public class Zadacha16 {
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
}
