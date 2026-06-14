import java.util.Scanner;

public class MyClass {
    
    public static int countDigit(Long n) {
        
        int count = 0;
        
        while (n > 0) {
            count++;
            n /= 10;
        }
        
        return count;
    }
    
    
  public static void main(String args[]) {

// HardCode Input
    //int number = 987654;
    //System.out.println("Total Count of Digit: " + countDigit(number));
    
// Scanner Code 
    Scanner sc = new Scanner(System.in);
    
    // Use Range
   // For Int - Minimum = -2,147,483,648 , Maximum =  2,147,483,647
   // For Long  - Minimum = -9,223,372,036,854,775,808, Maximum =  9,223,372,036,854,775,807
    System.out.print("Enter a number: ");
    Long number = sc.nextLong();
    System.out.println("Total Count of Digit: " + countDigit(number));
    sc.close();
    
  }
}