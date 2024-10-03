import java.util.Scanner;

public class JavaCalculator{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    //Taking first number input
    System.out.println("Enter the first number : ");
    double num1 = scanner.nextDouble();

    // Taking operator input
    System.out.println("Enter an operator ( +,-,*,/,% )");
    char operator = scanner.next().charAt(0);

    // Taking second number input
    System.out.println("Enter the second number : ");
    double num2 = scanner.nextDouble();

    double result;

    // Performing the calculation based on the operation

    switch (operator){
      case '+':
        result = num1 + num2;
        System.out.println("The result is :" + result);
        break;

      case '-':
        result = num1 - num2;
        System.out.println("The result is :" + result);
        break;

      case '*':
        result = num1 * num2;
        System.out.println("The result is :" + result);
        break;

      case '/':
        if (num2 != 0){
          result = num1 / num2;
          System.out.println("The result is :" + result);
        } else{
            System.out.println("Error! Division by zero is not allowed.");
        }
        break;

        case '%':
        if (num2 != 0){
          result = num1 % num2;
          System.out.println("The result is :" + result);
        } else{
            System.out.println("Error! Division by zero is not allowed.");
        }
        break;

      
      default:
      System.out.println("Invalid operator.");  
      break;    
    }

    
    scanner.close();

  }
}
