import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadFile {  
  public static void main(String[] args) {  
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập vào họ tên của sinh viên: ");
    String name = scanner.nextLine();
    scanner.close();

    

    try {
      InputStream filename = new FileInputStream(name);
      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj);  
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }  
} 
