package ChainOfResponsibility;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scn = new Scanner(System.in);

        System.out.println("enter first number ");

        double a = scn.nextDouble();

        System.out.println("enter second number ");

        double b = scn.nextDouble();

        System.out.println("enter operator ");

        String op = scn.next();

        scn.close();
        double r=0.0;


        switch (op){
            case "+":

                r = Sumx(a,b);

                break;
            case "-":
                r = Subs(a,b);
                break;
            case "*":
                r = Mult(a,b);
                break;
            case "/":
                if (b>0){
                    r = Div(a,b);
                } else {
                    throw new ArithmeticException(
                            "Numerator is zero.");
                }
                break;
            default:
                throw new IllegalArgumentException(
                        op + " unknown.");

        }

        System.out.println("result is : "+ r);

    }

    public static double Sumx(double a, double b)
    {

        return a+b;

    }

    public static double Subs(double a, double b)
    {

        return a+(-1*b);

    }

    public static double Mult(double a, double b)
    {

        return a*b;

    }
    public static double Div(double a, double b)
    {

        return a / b;



    }


}
