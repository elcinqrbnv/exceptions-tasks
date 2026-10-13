import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //1


        Scanner sc = new Scanner(System.in);
        boolean done = false;

        while (!done) {
            try {
                System.out.print("First number: ");
                int a = sc.nextInt();

                System.out.print("Second number: ");
                int b = sc.nextInt();

                int result = a / b;
                System.out.println("Result: " + result);
                done = true;

            } catch (InputMismatchException e) {
                System.out.println("Error");
                sc.nextLine();

            } catch (ArithmeticException e) {
                System.out.println("Error!!!");
            }
        }


        //2

        String[] names = {"Ali", "Vüsal", "Aysel"};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the index: " + (names.length - 1) + "): ");
            int index = scanner.nextInt();

            System.out.println("Element: " + names[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Wrong index! Massive's size " + names.length + "-dür.");

        } catch (InputMismatchException e) { // bonus
            System.out.println("Error: index must be up from 0 !");
        }


        //3



    }
}