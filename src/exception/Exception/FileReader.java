package Exception;
import java.util.Scanner;
public class FileReader {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            String file = sc.nextLine();

            if (file.equals("raj")) {
                System.out.println("print file name" + file);
            } else {
            throw
                new Exception();
            }
        }

        catch(Exception e) {
            System.out.println("file not found");

        }
            }
    }

