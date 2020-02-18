package cput.ac.za;


import java.util.Locale;
import java.util.Scanner;

public class App
{
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        App calculator = new App();
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        int x;
        double result = 0;
        calculator.showMenu();
        x = scan.nextInt();
        functionSwich(calculator, x);


    }

    static void functionSwich(App calculator, int x)
    {
        switch (x) {
            case 1:
                double result = calculator.addition();
                System.out.println(result);
                break;
            case 2:
                result = calculator.substraction();
                System.out.println(result);
                break;
            case 3:
                result = calculator.mutliplication();
                System.out.println(result);
                break;
            case 4:
                result = calculator.division();
                System.out.println(result);
                break;
            default:
                System.out.println("Wrong choice: Try again");
                break;
        }
    }

    public void showMenu() {
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

    }

    public double division() {
        scan.useLocale(Locale.US); //set to this have "." instead of "," it depends on your region
        double a, b;
        System.out.println("Enter first value");
        a = scan.nextDouble();
        System.out.println("Enter first value");
        b = scan.nextDouble();
        double val = a / b;

        return val;
    }
    public double mutliplication() {
        scan.useLocale(Locale.US);
        double a, b;
        System.out.println("Enter first value");
        a = scan.nextDouble();
        System.out.println("Enter first value");
        b = scan.nextDouble();
        double val = a * b;

        return val;
    }

    public double substraction() {
        scan.useLocale(Locale.US);
        double a, b;
        System.out.println("Enter first value");
        a = scan.nextDouble();
        System.out.println("Enter first value");
        b = scan.nextDouble();
        double val = a - b;

        return val;
    }

    public double addition() {
        scan.useLocale(Locale.US);
        double a, b;
        System.out.println("Enter first value");
        a = scan.nextDouble();
        System.out.println("Enter first value");
        b = scan.nextDouble();
        double val = a + b;

        return val;
    }

}
