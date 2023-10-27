import java.util.Scanner;

public class Average {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Find the average of the first N positive integers, where N is: ");
    int N = scanner.nextInt();
    double sum = 0;
    double average = 0;
    for (int i = 1; i <= N; i++){
        sum = i + sum;
    }
    average = sum/N;
    System.out.println("Result is: " + average);
  }
}
