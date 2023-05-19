//package lab-10;

import java.io.*;
public class q1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String str = br.readLine();
            while (str != null) {
                str = str.replace('#', '/');
                str=str.replace('*', '/');
                bw.write(str);
                str = br.readLine();
            }
            br.close();
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
 }
}
}