 import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      String fileName = scnr.nextLine();
      FileInputStream fileInput = null;
      Scanner fileScanner = null;
      try{
         fileInput = new FileInputStream(fileName);
         fileScanner = new Scanner(fileInput);
         while(fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            String[] tokens = line.split(",");
            
            String title = tokens[1];
            String rating = tokens[2];
            String showtime = tokens[0];
            if(fileScanner.hasNextLine() && tokens[1].equals(title)){
               showtime+=" "+tokens[0];
               line = fileScanner.nextLine();
               tokens = line.split(",");
               
               }else{
               showtime+=" "+tokens[0];
               line = fileScanner.nextLine();
               tokens = line.split(",");
               }
               if(title.length()>44){
                  title = title.substring(0,44);
                  }
                  System.out.printf("%-44s | %5s | %s%n", title,rating, showtime);
            }
         }finally {
            if (fileInput != null) {
                fileInput.close();
            }
            if (fileScanner != null) {
                fileScanner.close();
            }
        }
   }
}
