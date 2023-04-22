package madhu;
import java.lang.*;
import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) {
    
    System.out.print("Enter two values");
    Scanner num1 = new Scanner(System.in);
    int a = scanner.nextInt();
    Scanner num2 = new Scanner(System.in);
    int b = scanner.nextInt();
    int c= Sum(a,b);
    System.out.println("addition of given numbers " + a +" and " + b +" is " + c);
     int d= Subtract(a,b);
    System.out.println("sub of given numbers " + a +" and " + b +" is " + d);
     int e= Multiply(a,b);
    System.out.println("mul of given numbers " + a +" and " + b +" is " + d);
      int f= Division(a,b);
    System.out.println("division of given numbers " + a +" and " + b +" is " + d);
  }
  public static int Sum(int a, int b) {
    return a + b;
  }

  public static int Subtract(int a, int b) {
    return a - b;
  }

  public static int Multiply(int a, int b) {
    return a * b;
  }

  public static int Divide(int a, int b) {
    return a / b;
  }
}

