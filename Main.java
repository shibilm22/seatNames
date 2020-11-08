import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] seats = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    //These are the amount of seats
    int[] names = new int[15];
    //Amount of random student names
    Scanner scan = new Scanner(System.in);
    //Generate 15 random names
    for (int i = 0; i < names.length; i++)
      System.out.println("whats is your name?");
   String name = scan.next();
   System.out.println()
  }
}