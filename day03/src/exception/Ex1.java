package exception;

import java.io.*;

public class Ex1 {
    public static void main(String[] args) {
        File file = null;
        file = new File("C:\\java\\sm25java\\day03\\src\\a.txt");

        Reader reader = null;
        try {
            reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line = null;
            while(true) {
                line = br.readLine();
                if (line == null) break;
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println("Exception: " + e);
            return;
        }
    }
}
