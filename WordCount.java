import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the name of the file to read: ");
    File file = new File(scanner.nextLine());
    scanner = new Scanner(file);
    int wordCount = 1;
    String words = scanner.next();

    for (words =" "; scanner.hasNext(); words = scanner.next())
    {
      wordCount++;
    }
    System.out.println(wordCount + " words");
    }
  }
