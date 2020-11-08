import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] seats = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    // These are the amount of seats
    Scanner scan = new Scanner(System.in);
     // Amount of random student names
    String [] names = new String [15];
    // Generate 15 random names
    for (int i = 0; i < names.length; i++) {
      // seats start at index of 0 (1)
      // the seats have to be less than the length of names
      // You can only +1 to the index if it is less than the length of names
      System.out.println("Enter a name");
      names[i] = scan.next();
      // Every time you enter a name, the statement pops up 15 more times
    }
    int i = 0;
    while (i < names.length)
    //must be less than length of names
    {
      System.out.println(names[i] + "Sits in seat #" + seats[i]);
      //for every name added, a seat number is placed
      i++;
    }

  }

}
