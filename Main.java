import java.util.Scanner;

class Main {
public static void main(String[] args) {
    int[] seats = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    //These are the amount of seats
    int[] names = new int[15];
    //Amount of random student names
    Scanner scan = new Scanner(System.in);
    //Generate 15 random names
    for (int i = 0; i < names.length; i++){
    //seats start at index of 0 (1)
    //the seats have to be less than the length of names
    //You can only +1 to the index if it is less than the length of names
    System.out.println("Enter a name"); 
    //Every time you enter a name, the statement pops up 15 more times
    names[i] = scan.next();
    }
    int i = 0;
    while (i < names.length);{
    System.out.println(names [i] + "Sits in seat number" + seats [i]);
    }
    
}
  
  }
    
  
