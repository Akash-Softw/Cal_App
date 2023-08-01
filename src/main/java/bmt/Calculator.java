package bmt;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Calculator 
{

    public static int add (int number1, int number2){
        return number1 + number2;
    }




    public static int sub (int number1, int number2){
        return number1 - number2;
    }




    public static int multi (int number1, int number2){
        return number1 * number2;
    }




    public static int div (int number1, int number2){
        return number1 / number2;
    }
    public static void main( String[] args )
    {

      Scanner sc = new Scanner(System.in);
      System.out.println("enter the first number:");
      int firstinput = sc.nextInt();


      Scanner sc1 = new Scanner(System.in);
      System.out.println("enter the second number:");
      int secondinput = sc1.nextInt();
      System.out.println("The result of addition is:"+Calculator.add(firstinput, secondinput));
      System.out.println("The result of Subtraction is:"+Calculator.sub(firstinput, secondinput));
      System.out.println("The result of Multiplication is:"+Calculator.multi(firstinput, secondinput));
      System.out.println("The result of Division is:"+Calculator.div(firstinput, secondinput));
      
    
       
}
}
