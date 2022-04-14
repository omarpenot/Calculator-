
import java.util.Scanner;

public class calculator {

    public static double divide(double a, double b){ 
        return a / b;

    }   

    public static double multiply(double a, double b){
        return a * b;

    }

    public static double subtract(double a, double b){
        return a - b;

    }

    public static double addition(double a, double b){
        return a + b;

    }

    public static double mod(double a, double b){
        return a % b;

    }
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
        System.out.print("Please enter a number ");

        double number1 = input.nextDouble();
        
        System.out.print("Please enter another number ");

        double number2 = input.nextDouble();
        
        System.out.print("What would you like to do to these numbers? ");

        char symbol = input.next().charAt(0);
        

        if(symbol == '*' ) {
          System.out.println("Your answer is: " + multiply(number1, number2));

    }  else if (symbol == '-') {
            System.out.println("Your answer is: " + subtract(number1, number2));
        
    } 
            else if (symbol == '/') {
                System.out.println("Your answer is: " + divide(number1, number2));

    }
            else if (symbol == '+') {
                System.out.println("Your answer is: " +  addition(number1, number2));

    }
            else if (symbol == '%') {
                System.out.println("Your answer is: " + number1 % number2);

    }
            else if (symbol == '^') {
                System.out.println("Your answer is: " + (Math.pow(number1,number2)));
                
    }
        else {
            System.out.println("Error, please input a correct arithmetic operation");

            input.close();
            break; 
        }
        }
    }

}
