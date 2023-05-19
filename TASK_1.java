
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Task_1 {
    public static void main(String args[]) throws IOException{
         File file1 = new File("C:\\Users\\KIIT\\Desktop\\JAVA\\file1.txt");
         Scanner scan = new Scanner(file1);
         String filecontent="";
         while(scan.hasNextLine()) {
         System.out.println(scan.nextLine());
         filecontent = filecontent.concat(scan.nextLine() + "\n");
         }
         FileWriter writer = new FileWriter("C:\\Users\\KIIT\\Desktop\\JAVA\\newfile.txt");
          writer.write(filecontent);
          writer.close();
    }
    
}
