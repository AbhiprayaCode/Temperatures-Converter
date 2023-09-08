import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double celsius, fahrenheit;


        // VALUE
        System.out.println("Input Fahrenheit: ");
        Scanner inputSuhu = new Scanner(System.in);
        fahrenheit = inputSuhu.nextDouble();

        //FORMULA
        celsius = ((5.0 / 9) * (fahrenheit - 32));

        //RESULT
         System.out.println("The value of celsius that convert from " + fahrenheit + " fahrenheit degree is " + celsius + " celsius degree");


    }
}