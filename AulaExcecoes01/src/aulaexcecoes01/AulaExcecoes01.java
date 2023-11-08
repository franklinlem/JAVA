package aulaexcecoes01;

import static aulaexcecoes01.DivideByZeroNoExceptionHandling.quotient;
import java.util.Scanner;

public class AulaExcecoes01{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter an integer numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Please enter an integer denominator: ");
        int denominator = scanner.nextInt();
        
        int result = quotient(numerator, denominator);
        System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
  }    
}//fim da classe DivideByZeroNoExceptionHandling