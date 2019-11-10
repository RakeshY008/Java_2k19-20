/*
@Author : Rakesh Yadav
@Version : 1.0
 */
package fileHandling;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) {
        try {
            File myObj = new File("/home/yadav/IdeaProjects/Java_2k19-20/JAVA/src/fileHandling/testFile.txt");
            if (myObj.exists()){
                Scanner readFile = new Scanner(myObj);
                while (readFile.hasNextLine()){
                    String data = readFile.nextLine();
                    System.out.println(data);
                }
                readFile.close();
            }else
                System.out.println("File Doesn't Exists");
        }catch (IOException x ){
            System.out.println("An Error has Been Found");
            x.printStackTrace();
        }
    }
}
