import java.util.Scanner;
/**
 * takes an integer and tells the sum of all odd numbers up to it
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    // ask for an integer and make variable for it
    System.out.println("Please enter the maximum number to sum to:");
    int num = input.nextInt();
    // variable for the sum of all odd numbers
    int sum = 0;
    //for loop with if statement
    for(int i = 0; i <= num; i++){
      if(i % 2 == 1){
        sum = sum + i;
      }
    }
    // saying the answer
    System.out.println("The sum of the odd numbers is" + " " + sum);
  }
}
