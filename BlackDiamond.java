import java.util.Scanner;
public class BlackDiamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a positive integer for pattern size: ");
    int posInt = scanner.nextInt();

    for (int i=0; i<=posInt;i++){
      for(int j=0; j<=posInt-i-1; j++){
        System.out.print(" ");
      }
      for (int j=0; j<=i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    for(int i=0; i<posInt;i++) {
      for(int j=0;j<=i;j++){
        System.out.print(" ");
      }
      for(int j=0;j<posInt-i;j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}